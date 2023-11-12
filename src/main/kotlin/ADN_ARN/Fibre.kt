package ADN_ARN

class Fibre(var LSN: ArrayList<Nucleotides> = ArrayList()) {

    fun estVide():Boolean{
        return this.LSN.isEmpty()
    }
    fun affiche():Unit{
        for (c in this.LSN)
            println("Nucleotide: "+c.toString())
    }

    fun complement(N:Nucleotides):Nucleotides{

        return when (N) {
            Nucleotides.A -> Nucleotides.T
            Nucleotides.T -> Nucleotides.A
            Nucleotides.C -> Nucleotides.G
            else -> Nucleotides.C
        }
    }
    fun dupliquer():Fibre{
        val res = Fibre()
        for (c in this.LSN)
            res.LSN.add(complement(c))
        return res

    }
    fun comparer(F:Fibre):Boolean{
       if (this.LSN.size!=F.LSN.size)
           return false
       else{
           for (i in 0 until this.LSN.size){
               if (this.LSN[i]!=complement(F.LSN[i]))
                   return false
           }
       }
       return true
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