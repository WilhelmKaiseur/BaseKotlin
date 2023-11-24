open class CompteCourant(
    Num: Int,
    Solde: Int,
    Plancher: Int,
    private var nbJour: Int,
    private var tauxAgios: Double
):Compte(Num, Solde, Plancher){

    fun calculAgios():Double{
        var N: Int = 14*(this.nbJour/14)
        return (this.solde*N*this.tauxAgios)/365
    }
    override fun affiche():Unit{
        println("Compte Courant\n\t" +
                "Numero: ${this.num}\n\t" +
                "Solde: ${this.consulterSolde()}\n\t" +
                "Agios: ${this.calculAgios()}")
    }
}