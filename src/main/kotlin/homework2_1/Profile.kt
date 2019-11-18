package homework2_1

class Profile (
    val id: Int,
    val login: String,
    val name: String,
    val surname: String,
    val status: String,
    val avatar: String)
{

    val fullname: String
        get() = "$name $surname"

    /*fun getFullname(): String {

        val fullname = name + " " + surname
        return fullname
    }*/


}