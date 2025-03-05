package ejercicio2

fun main() {
    val child = 6
    val adult = 25
    val senior = 70
    val isMonday = true
    println("El precio de la entrada de cine para una persona de $child años es \$${ticketPrice(child, isMonday)}.")
    println("El precio de la entrada de cine para una persona de $adult años es \$${ticketPrice(adult, isMonday)}.")
    println("El precio de la entrada de cine para una persona de $senior años es \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when {
        age <= 12 -> 15
        age in 13..60 -> if (isMonday) 25 else 30
        age >= 61 && age <= 100 -> 20
        else -> -1
    }
}
