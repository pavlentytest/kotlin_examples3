import java.util.*

fun isPrime(n: Int): Boolean {
    for(i in 2 until n) {
        if(n % i == 0) {
            return false
        }
    }
    return true
}
fun main() {

    val scan: Scanner
    scan = Scanner(System.`in`)
    val x = scan.nextInt()
    if(isPrime(x))
        println("prime")
    else
        println("composite")
}