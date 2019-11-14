package homework2_1

class Profile (
    val id: Int,
    val login: String,
    val name: String,
    val surname: String,
    val status: String,
    val avatar: String)
{

    fun getFullname(): String {

        val fullname = name + " " + surname
        return fullname
    }


}