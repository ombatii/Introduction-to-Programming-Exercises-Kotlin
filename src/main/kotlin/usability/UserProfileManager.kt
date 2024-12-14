package usability

class UserProfile(val id: Int, val name: String, val email: String?)


fun main(){

    val userName: String = "Brian"

    val userEmail: String? = null
    println("User email: ${userEmail ?: "No email provided"}")
    println("Is userEmail null or empty? ${userEmail.isNullOrEmpty()}")
    println("Is userEmail null or blank? ${userEmail.isNullOrBlank()}")



    val userProfile = UserProfile(21, "Ombati", null)
    val emailLength: Int? = userProfile.email?.length
    println("Email lenght: ${emailLength ?: "No email available" }")

    //val forcedLenght: Int = userProfile.email!!.lenght


    //Nullable Function return
    fun getUserById(id: Int): UserProfile? {
        return if (id == 1) userProfile else null
    }

    val user = getUserById(9)
    println("User found: ${user?.name ?: " No user with this ID"}")


    // Nullable Variables in Loops
    val userList = listOf(
        UserProfile(1, "Dedan","dedan@gmail.com"),
        UserProfile(2,"Kimathi","kimathi@gmail.com"),
        UserProfile(3, "University","unversity@gmail.com")
    )

    for (user in userList){
        println("User: ${user.name}, Email: ${user.email ?: "Email not provided"}")
    }









}