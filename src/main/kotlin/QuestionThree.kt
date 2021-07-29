/**
 *
 * @author Yogi Prasetio
 */

fun main(){
    print("Input waktu (hh:mm:ss AM/PM): ")
    val time = readLine()

    val format = time!!.substring(9,11)
    val hour = time.substring(0,2).toInt()
    val minute = time.substring(3,5)

    if (format == "PM"){
        if (hour == 12){
            print("$time => $hour:$minute")
        } else {
            print("$time => "+(12+hour).toString()+":$minute")
        }
    } else if (format == "AM"){
        if (hour == 12) {
            print("$time => 00:$minute")
        } else {
            print("$time => $hour:$minute")
        }
    } else {
        print("Format waktu tidak sesuai!")
    }
}