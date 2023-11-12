package ADN_ARN

fun main(args: Array<String>){
    var f1 = Fibre()
    var f2 = Fibre()
    var f3 = Fibre()
    f3 = f1.dupliquer()


    f1.run {

        LSN.add(Nucleotides.C)
        LSN.add(Nucleotides.C)
        LSN.add(Nucleotides.G)
        LSN.add(Nucleotides.A)
        LSN.add(Nucleotides.T)
        LSN.add(Nucleotides.T)
        LSN.add(Nucleotides.A)
        LSN.add(Nucleotides.G)
    }
    f2.run {

        LSN.add(Nucleotides.A)
        LSN.add(Nucleotides.C)
        LSN.add(Nucleotides.G)
        LSN.add(Nucleotides.T)
        LSN.add(Nucleotides.T)
        LSN.add(Nucleotides.A)
        LSN.add(Nucleotides.A)
        LSN.add(Nucleotides.G)
    }

    println("Distance de Hamming: "+f1.Hamming(f2))
    println("Sont complementaires ? "+f1.comparer(f1.dupliquer()))

    f3.affiche()

}