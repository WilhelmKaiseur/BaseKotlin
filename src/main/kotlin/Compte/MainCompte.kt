fun main(args: Array<String>){
    val CC: CompteCourant = CompteCourant(1,10000,1000,33,0.05)
    val CE: CompteEpargne = CompteEpargne(50,500000,1000,0.17,200)
    CC.affiche()
    CE.affiche()


}