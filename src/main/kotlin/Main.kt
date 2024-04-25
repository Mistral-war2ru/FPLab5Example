import java.lang.System.`in`
import java.util.*

fun max(x : Int,y : Int,z : Int) : Int{
    return if (x>y) if (x>z) x else z else if (y>z) y else z
}

fun main()
{
    println("Hello World!")
    val scanner = Scanner(`in`)
    val x : Int = scanner.nextInt()
    val y : Int = scanner.nextInt()
    val z : Int = scanner.nextInt()
    println(max(x,y,z))
}