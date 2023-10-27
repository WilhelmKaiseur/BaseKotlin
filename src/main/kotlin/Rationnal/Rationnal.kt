class Rationnal(num:Int,denom:Int) {

    var num: Int = num
    var denom: Int = denom

    constructor(num: Int):this(num,1)

    fun normaliser():Unit{
        val pgcdValue: Int = pgcd(this.num,this.denom)
        this.num /= pgcdValue
        this.num /= pgcdValue
    }
     fun pgcd(a: Int,b:Int):Int {
        if (a==b)
            return a
        else if (a<b)
            return pgcd(a,(b-a))
        else
            return pgcd((a-b),b)

    }
    fun add(R:Rationnal):Rationnal{
        var R1: Rationnal = Rationnal(0,0)
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
            var val_reel:ArrayList<Double> = ArrayList<Double>()
            var i: Int = 0
            while (i<R_Tab.size){
                var tmp:Double = R_Tab[i].num/R_Tab[i].denom.toDouble()
                val_reel[i] = tmp
                i++
            }
            var min:Double = val_reel[0]
            var ind:Int = 0
            i++
            while (i<R_Tab.size){
                if (min>val_reel[i]){
                    min = val_reel[i]
                    ind = i
                }
                i++
            }
            println("Le plus petit est: "+R_Tab[ind].toString())
        }
    }

}