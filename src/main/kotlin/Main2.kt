import java.lang.System.`in`
import java.util.*

val scanner = Scanner(`in`)

fun vvodd(n: Int, m: MutableList<Int>)
{
    if (n>0)
    {
        m.add(scanner.nextInt())
        vvodd(n-1, m)
    }
}

fun vvod(n: Int):MutableList<Int>
{
    val m:MutableList<Int> = mutableListOf()
    vvodd(n, m)
    return m
}

tailrec fun arrayOP(m: MutableList<Int>,i: Int, a: Int = 0, f: (Int, Int) -> Int): Int =
    if (i <= 0) a else arrayOP(m,i-1, f(a, m[i-1]), f)

fun sumd(m: MutableList<Int>): Int = arrayOP(m, m.size, 0) { a, b -> (a + b) }
fun muld(m: MutableList<Int>): Int = arrayOP(m, m.size, 1) { a, b -> (a * b) }
fun maxd(m: MutableList<Int>): Int = arrayOP(m, m.size, m[0]) { a, b -> if (a > b) a else b }
fun mind(m: MutableList<Int>): Int = arrayOP(m, m.size, m[0]) { a, b -> if (a < b) a else b }

fun main() {
    println("Hello World!")
    val scanner = Scanner(`in`)
    val n: Int = scanner.nextInt()
    val m = vvod(n)
    println(m)
    println(sumd(m))
    println(muld(m))
    println(maxd(m))
    println(mind(m))
}