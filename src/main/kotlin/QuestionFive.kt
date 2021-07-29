/**
 *
 * @author Yogi Prasetio
 */

class PalindromCheck{
    companion object{
        fun isPalindrom(arg: String): Boolean{
            return arg == arg.reversed()
        }
    }
}

fun main(){
    print("Masukkan kalimat: ")
    val kalimat = readLine()

    print(PalindromCheck.isPalindrom(kalimat.toString().toLowerCase()))
}
