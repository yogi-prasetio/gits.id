/**
 *
 * @author Yogi Prasetio
 */

fun main(){
    print("Inputkan bilangan: ")
    val bil = readLine()

    val bilangan = bil?.toInt()

    if(bilangan != null){
        if(bilangan%3 == 0 && bilangan%5 == 0){
            print("Hello World")
        } else if(bilangan%3 == 0){
            print("Hello")
        } else if(bilangan%5 == 0){
            print("World")
        } else {
            print("Bilangan tidak masuk kategori")
        }
    }

}