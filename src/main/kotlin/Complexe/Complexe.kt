package Complexe

class Complexe(re:Float,im:Float) {

    private var Re:Float = re
        get() = field
        set(value) {
            field = value
        }
    private var Im:Float = im
        get() = field
        set(value) {
            field = value
        }
    override fun toString(): String {
        return "${this.Re}+(${this.Im})i"
    }
    fun add(C:Complexe):Complexe{
        return Complexe(this.Re+C.Re,this.Im+C.Im)
    }
    fun sub(C: Complexe):Complexe{
        return Complexe(this.Re-C.Re,this.Im-C.Im)
    }
    fun mult(C: Complexe):Complexe{
        val reel =(this.Re*C.Re)-(this.Im*C.Im)
        val imag = (this.Re*C.Im)+(this.Im*C.Re)

        return Complexe(reel,imag)
    }

    companion object{
        fun minCom(C_Tab:ArrayList<Complexe>):Unit{
            for (c in C_Tab)
                c.Im++
        }
    }

}