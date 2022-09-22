import java.util.Scanner

/*fun main() {
    hello()
    hello2("123")
    hello2("345")
    hello3("Ivan",56)
    hello3(age=30,name="Petr")
    hello3("Olga")
    printNames("Ivan","Maria","Olga","Kirill")
}*/
fun hello() {
    println("123123")
    val z = 100
    println("z = $z")
}
fun hello2(message: String) {
    println(message)
}
fun hello3(name: String, age: Int = 20) {
    println("Name: $name, age: $age")
}

fun printNames(vararg strings: String) {
    for(str in strings) {
        println(str)
    }
}
fun printSum(ages: IntArray): Int {
    var sum = 0
    for(a in ages) {
        sum += a
    }
    return sum
}
/*fun main() {
    val nums = intArrayOf(5,2,12,53)
    println(printSum(nums));
    println(hello3("1231")::class)
    println(printSum(nums)::class)
    square(3)
}*/

// Java - ничего не возвращается - тип Void
// Kotlin - ничего не возвращается - тип Unit

fun square(x: Int) = x*x

fun compareAge(age1: Int, age2: Int) {
    // локальная функция
    /*fun ageIsValid(age: Int): Boolean {
        return age in 1..49
    }*/
    fun ageIsValid(age: Int) = age in 1..49

    if(!ageIsValid(age1) || !ageIsValid(age2)) {
        println("Bad age!")
    }
}
/*fun main() {
    compareAge(23,26)
    val message: () -> Unit // Функция без параметров + ничего не возвращает
    message = ::hello
    message()

    val operation: (Int, Int) -> Int = ::sum
    println(operation(5,6))

    // анонимные функции
    val sum = fun(p: Int, d: Int): Int = p+d
    val res = sum(78,33)
    println(res)

    val hh = {println("Ura!")}
    hh()
    hh()

    val rr: () -> Unit = { println("123") }

}
*/


fun sum(a: Int, b: Int) : Int {
    return a+b
}
fun sum(a: Double, b: Double): Double {
    return a+b
}

// Задача №306. Минимум 4 чисел
// Math.min

// Задача №312. Числа Фибоначчи

// Задача №310. Проверка на простоту
