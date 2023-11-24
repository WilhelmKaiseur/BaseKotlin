package ADN_ARN

class Fibre<T>(var LSN: ArrayList<T> = ArrayList()) {

    constructor():this(arrayListOf<T>())

    fun estVide():Boolean{
        return this.LSN.isEmpty()
    }
    fun affiche():Unit{
        for (c in this.LSN)
            println("Nucleotide: "+c)
    }

    fun complement(N: Nucleotides):Nucleotides{

        return when (N) {
            Nucleotides.A -> Nucleotides.T
            Nucleotides.T -> Nucleotides.A
            Nucleotides.C -> Nucleotides.G
            else -> Nucleotides.C
        }
    }
    fun dupliquer():Fibre<T>{
        val res:Fibre<T> = Fibre()
        for (c in this.LSN)
            //res.LSN.add(complement(c))
        return res
        return TODO("Provide the return value")
    }
    fun comparer(F:Fibre<T>):Boolean{
       if (this.LSN.size!=F.LSN.size)
           return false
       else{
           for (i in 0 until this.LSN.size){
               //if (this.LSN[i]!=F.LSN[i].complement())
                   return false
           }
       }
       return true
    }
    fun comparerSimple(F: Fibre<T>): Boolean {
        return this.LSN.equals(F.dupliquer().LSN)
    }
    fun Hamming1(F: Fibre<T>):Int{
        //On suppose que les deux fibres ont la meme taille
        var res = 0
        for (i in 0 until this.LSN.size)
            if (this.LSN.elementAt(i)!=F.LSN.elementAt(i))
                res +=1
        return res
    }
    fun Hamming2(F: Fibre<T>):Int{
        var res=0
        try {
            if (this.LSN.size!=F.LSN.size)
                throw Exception()
            else
                for (i in 0 until this.LSN.size)
                    if (this.LSN.elementAt(i)!=F.LSN.elementAt(i))
                        res +=1
        }catch (e:Exception){
            println("Les deux fibres doivent etre de meme taille !!!")
            res = -1
        }
        return res
    }

}