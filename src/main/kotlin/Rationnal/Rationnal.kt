class Rationnal(num:Int,denom:Int) {

    var num: Int = num
        get() = this.num
        set(n:Int) {
            field = n
        }
    var denom: Int = denom

    constructor(num: Int):this(num,1)

    fun normaliser():Unit{
        val pgcdValue: Int = pgcd(this.num,this.denom)
        this.num /= pgcdValue
        this.denom /= pgcdValue
    }
     fun pgcd(a: Int,b:Int):Int {
         return if (a==b)
             a
         else if (a<b)
             pgcd(a,(b-a))
         else
             pgcd((a-b),b)

    }
    fun add(R:Rationnal):Rationnal{
        val R1: Rationnal = Rationnal(0,0)
        R1.num = (this.num*R.denom)+(this.denom*R.num)
        R1.denom = this.denom*R.denom
        R1.normaliser()
        return R1
    }
    fun sub(R:Rationnal):Rationnal{
        R.num = -R.num
        return this.add(R)
    }
    fun mult(R: Rationnal):Rationnal{
        val Res = Rationnal(this.num*R.num,this.denom*R.denom)
        Res.normaliser()

        return Res
    }
    fun div(R: Rationnal):Rationnal{
        return this.mult(Rationnal(R.denom,R.num))
    }
    override fun toString(): String {
        return this.num.toString() + "/" + this.denom
    }
    companion object{
        fun minRat(R_Tab:ArrayList<Rationnal>):Unit{

            var res:Rationnal = R_Tab[0]
            for (c in R_Tab)
                if ((res.num/res.denom.toDouble())>(c.num/c.denom.toDouble()))
                    res = c
            println("Le plus petit rationnel est: "+res.toString())
        }
    }

}