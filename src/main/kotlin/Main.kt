import java.lang.System.`in`
import java.util.*

fun max(x : Int,y : Int,z : Int) : Int{
    return if (x>y) if (x>z) x else z else if (y>z) y else z
}

fun factup(n : Int):Int{
    return if (n<=1) 1 else factup(n-1) * n
}

tailrec fun factd(n : Int,a : Int):Int{
    return if (n<=1) n * a else factd(n - 1, n * a)
}

fun factdown(n : Int):Int{
    return factd(n, 1)
}

fun main()
{
    println("Hello World!")
    val scanner = Scanner(`in`)
    val x : Int = scanner.nextInt()
    println(factdown(x))
}