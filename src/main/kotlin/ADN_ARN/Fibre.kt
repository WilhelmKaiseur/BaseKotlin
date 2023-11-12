package ADN_ARN

class Fibre(var LSN: ArrayList<Nucleotides> = ArrayList()) {

    fun estVide():Boolean{
        return this.LSN.isEmpty()
    }
    fun affiche():Unit{
        for (c in this.LSN)
            println("Nucleotide: "+c.toString())
    }

    companion object{
        fun complement(N:Nucleotides):Nucleotides{

           return when (N) {
                Nucleotides.A -> Nucleotides.T
                Nucleotides.T -> Nucleotides.A
                Nucleotides.C -> Nucleotides.G
                else -> Nucleotides.C
            }
        }
        fun dupliquer(F: Fibre):Fibre{
            val res = Fibre()
            for (c in F.LSN)
                res.LSN.add(complement(c))
            return res

        }
        //fun comparer(F:Fibre):Boolean{
         //   return (dupliquer(this)==F)
        //}
    }
    fun Hamming(F: Fibre):Int{
        //On suppose que les deux fibres ont la meme taille
        var res = 0
        for (i in 0 until this.LSN.size)
            if (this.LSN.elementAt(i)!=F.LSN.elementAt(i))
                res +=1
        return res
    }

}