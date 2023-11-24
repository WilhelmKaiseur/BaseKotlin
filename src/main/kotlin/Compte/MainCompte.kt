fun main(args: Array<String>){
    /*val CC: CompteCourant = CompteCourant(1,10000,1000,33,0.05)
    val CE: CompteEpargne = CompteEpargne(50,500000,1000,0.17,200)
    CC.affiche()
    CE.affiche()*/

    println("\t--Bienvenue-- \n Que souhoutez-vous faire?\n")
    val TabCompte = ArrayList<Compte>()
    do {
        println("""
            1-Creer un compte
            2-Crediter mon compte(Depot)
            3-Debiter mon compte(Retrait)
            4-Verifier mon solde
            5-Infos sur compte
            6-Quitter
        """.trimIndent())
        val choix = readln().toInt()
        when(choix){
            1->{
                println("Quel type de compte ?\n")
                println("""
                    1-Compte epargne
                    2-Compte courant
                    3-Compte simple
                """.trimIndent())
                val com = readln().toInt()
                when(com){
                    1->{
                        println("Numero: ")
                        val num = readln().toInt()
                        println("Solde: ")
                        val solde = readln().toInt()
                        println("Plancher: ")
                        val planch = readln().toInt()
                        println("Taux d'interet: ")
                        val taux = readln().toDouble()
                        println("Nombres de jours: ")
                        val jours = readln().toInt()

                        val C = CompteEpargne(num,solde,planch,taux,jours)
                        TabCompte.add(C)
                        C.affiche()
                        println("Success\n")
                    }
                    2->{
                        println("Numero: ")
                        val num = readln().toInt()
                        println("Solde: ")
                        val solde = readln().toInt()
                        println("Plancher: ")
                        val planch = readln().toInt()
                        println("Taux d'agios: ")
                        val taux = readln().toDouble()
                        println("Nombres de jours: ")
                        val jours = readln().toInt()

                        val C = CompteCourant(num,solde,planch,jours,taux)
                        TabCompte.add(C)
                        C.affiche()
                        println("Success\n")
                    }
                    3->{
                        println("Numero: ")
                        val num = readln().toInt()
                        println("Solde: ")
                        val solde = readln().toInt()
                        println("Plancher: ")
                        val planch = readln().toInt()
                        println("Taux d'agios: ")

                        val C = Compte(num,solde,planch)
                        TabCompte.add(C)
                        C.affiche()
                        println("Success\n")
                    }
                }
            }
            2->{
                println("Entrez votre numero de compte")
                val num = readln().toInt()
                var i:Int = 0
                while (i<TabCompte.size&&num!=TabCompte[i].id()){
                    i++
                }
                if (i<TabCompte.size){
                    println("Entrez le montant...")
                    val amt = readln().toInt()
                    TabCompte[i].crediterCompte(amt)
                    println("Succes!!!\n Nouveau solde: "+TabCompte[i].consulterSolde())
                }else{
                    println("Compte inexistant")
                }
            }
            3->{
                println("Entrez votre numero de compte")
                val num = readln().toInt()
                var i:Int = 0
                while (i<TabCompte.size&&num!=TabCompte[i].id()){
                    i++
                }
                if (i<TabCompte.size){
                    println("Entrez le montant...")
                    val amt = readln().toInt()
                    if (TabCompte[i].debiterCompte(amt))
                        println("Succes!!!\n Nouveau solde: "+TabCompte[i].consulterSolde())
                    else
                        println("Solde insuffisant")
                }else{
                    println("Compte inexistant")
                }
            }
            4->{
                println("Entrez votre numero de compte")
                val num = readln().toInt()
                var i:Int = 0
                while (i<TabCompte.size&&num!=TabCompte[i].id()){
                    i++
                }
                if (i<TabCompte.size)
                    println("Solde: "+TabCompte[i].consulterSolde())
                else
                    println("Compte inexistant")
            }
            5->{
                println("Entrez votre numero de compte")
                val num = readln().toInt()
                var i:Int = 0
                while (i<TabCompte.size&&num!=TabCompte[i].id()){
                    i++
                }
                if (i<TabCompte.size)
                    TabCompte[i].affiche()
                else
                    println("Compte inexistant")
            }
        }
    }while (choix!=6)

}