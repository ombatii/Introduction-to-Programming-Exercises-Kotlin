package objects

fun main(){
    val list1 = mutableListOf<Char>('A')
    list1 += 'B'
    println(list1)

    var list2 = listOf('C')
    list2 += 'D'
    println(list2)


}