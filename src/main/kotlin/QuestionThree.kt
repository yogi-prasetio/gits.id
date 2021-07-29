/**
 *
 * @author Yogi Prasetio
 */

internal enum class t {
    ;

    companion object {
        @JvmStatic
        fun main(a: Array<String>) {
            var a = a
            a = a[0].split("[: ]").toTypedArray()
            System.out.format("%02d%02d", (a[0].toLong() + if (a[2][0] == 'p') 12 else 0) % 24, a[1].toLong())
        }
    }
}