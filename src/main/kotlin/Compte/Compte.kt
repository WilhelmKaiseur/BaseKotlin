open class Compte(Num:Int,Solde:Int,Plancher:Int) {
    protected var num:Int = Num
    protected var solde:Int = Solde
    protected var plancher:Int = Plancher

    fun consulterSolde():Int{
        return this.solde
    }
    fun crediterCompte(Montant:Int):Unit{
        this.solde += Montant
    }
    fun debiterCompte(Montant:Int):Boolean{
        if ((this.solde-this.plancher)-Montant>0)
            this.solde -= Montant
        return true
    }

}