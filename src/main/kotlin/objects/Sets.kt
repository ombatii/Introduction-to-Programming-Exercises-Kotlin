package objects

import atomictest.eq

fun main(){
    val intSet = setOf(1, 1, 2, 3, 9, 9, 4)

    //No duplicates
    println(intSet)

    //Element order is unimportant
    setOf(1, 2) eq setOf(2, 1)

    //set memebership
    (9 in intSet) eq true
    (99 in intSet) eq false


    intSet.containsAll(setOf(1, 9, 2)) eq true

    val x = intSet.union(setOf(3, 4, 5, 6))
    println("x: ${x}")

    val y = intSet intersect setOf(0, 1, 2, 7, 8)
    println("y: ${y}")

    val z = intSet subtract setOf(0, 1 ,9, 10)
    println(z)










}