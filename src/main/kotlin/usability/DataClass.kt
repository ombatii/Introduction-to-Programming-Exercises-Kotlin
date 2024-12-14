package usability

//Student Record
data class Student(val name: String,
                   val age: Int,
                   val grade: String
)

fun main(){
    val student1 = Student("Brian",23,"A")
    val student2 = student1.copy(name="Ombati")
    println("student one : $student1")
    println("student two : $student2")

}