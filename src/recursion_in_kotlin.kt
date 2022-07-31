

fun factorial(number: Int): Long{
    return if (number==1) number.toLong() else number*factorial(number-1)
}
//factorial is recursive since it calls itself in the else statement

fun main(args: Array<String>){
    val num=4
    val fact: Long

    fact=factorial(num)
    println("Factorial of $num! = $fact")
}