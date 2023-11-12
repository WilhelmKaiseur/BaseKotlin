fun main(args: Array<String>) {
    var r1: Rationnal = Rationnal(8,7)
    var r2: Rationnal = Rationnal(2,3)
    var r3:Rationnal = Rationnal(5)
    r3.num=7
    println(r3.toString())
    println("r1+r2 = "+r1.add(r2).toString())
    println("r1*r2 = "+r1.mult(r2).toString())
    println("r1/r2 = "+r1.div(r2).toString())

    var Tab: ArrayList<Rationnal> = ArrayList()
    Tab.add(r1)
    Tab.add(r2)
    Tab.add(r3)

    Rationnal.minRat(Tab)

}

open class Personne(name:String){
    val name:String
    //
    init {
        this.name = name+" F"
    }
    //
    constructor():this("Toto")
    open internal fun affiche(){
        println("A person $name")
    }
    abstract class Enfant{
        abstract fun marcher()
    }
    interface Action{
        abstract fun marcher()
    }
    //
    class Etudiant<T>(name:String,age:T):Personne(name),Action{
        var age = age
        override fun affiche() {
            super.affiche()
            println("$age ans")
        }
        override fun marcher() {
            println("Person marcher")
        }

    }
}