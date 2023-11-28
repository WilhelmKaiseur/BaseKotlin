open class Compte(Num:Int,Solde:Int,Plancher:Int) {
    protected var num:Int = Num
    protected var solde:Int = Solde
    protected var plancher:Int = Plancher

    fun consulterSolde():Int{
        return this.solde
    }
    fun id():Int{
        return this.num
    }
    open fun affiche(){
        println("""
            Compte
                Numero: ${this.num}
                Solde: ${this.solde}
        """.trimIndent())
    }
    fun crediterCompte(Montant:Int):Unit{
        this.solde += Montant
    }
    fun debiterCompte(Montant:Int):Boolean{
        when {
            (this.solde-this.plancher)-Montant>0 -> {
                this.solde -= Montant
                return true
            }
            else -> return false
        }
    }

}