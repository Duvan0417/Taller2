package ejercicio2

fun main() {
    val child = 5
    val adult = 28
    val senior = 87
    val isMonday = true
    println("The ticket price for a person aged $child years is \$${ticketPrice(child, isMonday)}.")
    println("The ticket price for a person aged $adult years is \$${ticketPrice(adult, isMonday)}.")
    println("The ticket price for a person aged $senior years is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when (age){
        in 1 ..  12 -> 15
        in 13..60 -> if (isMonday) 25 else 30
        in 61 .. 100 -> 20
        else -> -1
    }
}
