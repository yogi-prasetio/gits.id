/**
 *
 * @author Yogi Prasetio
 */

class EmailChecker{
    companion object{
        private const val EMAIL_REGEX = "(\\W|^)[A-Za-z0-9]{1,20}@(.*)\\.(co|id)(\\b|id)(\\W|\$)"

        fun isValid(email: String): Boolean {
            return EMAIL_REGEX.toRegex().matches(email)
        }
    }
}

fun main(){
    print("Masukkan email: ")
    val email = readLine()

    if(email != null) {
        print(EmailChecker.isValid(email))
    }
}