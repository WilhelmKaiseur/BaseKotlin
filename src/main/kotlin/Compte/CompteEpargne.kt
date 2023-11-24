open class CompteEpargne(
    Num: Int,
    Solde: Int,
    Plancher: Int,
    private var tauxInteret: Double,
    private var nbJour: Int
): Compte(Num, Solde, Plancher) {

    fun calculInteret():Double{
        var N: Int = 90*(this.nbJour/90)
        return (this.solde*N*this.tauxInteret)/365
    }
    override fun affiche():Unit{
        println("""
            Compte Epargne
                Numero: ${this.num}
                Solde: ${this.consulterSolde()}
                Interet: ${this.calculInteret()}
        """.trimIndent())
    }
}