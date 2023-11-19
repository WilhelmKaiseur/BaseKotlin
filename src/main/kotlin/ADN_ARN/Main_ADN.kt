package ADN_ARN

fun main(args: Array<String>){
    var f1 = Fibre<Nucleotides>()
    var f2 = Fibre<Nucleotides>()
    var f3 = Fibre<Nucleotides>()


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

    println("Distance de Hamming: "+f1.Hamming2(f2))
    for (i in 0 until f1.LSN.size)
        println(f1.LSN[i].complement() )

}