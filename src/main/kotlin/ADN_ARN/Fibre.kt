package ADN_ARN

class Fibre {

    val LSN:ArrayList<Nucleotides> = ArrayList()

    fun estVide():Boolean{
        return this.LSN.isEmpty()
    }
    fun complement(N:Nucleotides):Nucleotides{

        when (N) {
            Nucleotides.A -> return Nucleotides.T
            Nucleotides.T -> return Nucleotides.A
            Nucleotides.C -> return Nucleotides.G
            else -> return Nucleotides.C
        }
    }
    fun dupliquer(F:Fibre):Fibre{
        val res = Fibre()
        for (c in F.LSN)
            res.LSN.add(complement(c))
        return res

    }
    fun comparer(F:Fibre):Boolean{
        return (F==dupliquer(this))
    }
    fun Hamming(F: Fibre):Int{
        var res = 0
        for (i in 0 until this.LSN.size)
            if (this.LSN.elementAt(i)!=F.LSN.elementAt(i))
                res +=1
        return res
    }

}