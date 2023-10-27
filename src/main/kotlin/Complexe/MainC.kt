package Complexe

fun main(args: Array<String>){

    val c1:Complexe = Complexe(2F,3F)
    val c2:Complexe = Complexe(4F,-5F)
    println("Complexe: "+c1.toString())
    println("Complexe: "+c2.toString())
    println("Somme: "+c2.add(c1).toString())
    println("Produit: "+c2.mult(c1).toString())
}