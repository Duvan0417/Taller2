fun main() {
    val Martha = Person("Martha", 33, "jugar tenis", null)
    val Mateo = Person("Mateo", 28, "escalar", Martha)
    Martha.showProfile()
    Mateo.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        val referrerInfo = referrer?.let { "Tiene como referente a ${it.name}, que disfruta de ${it.hobby}." }
            ?: "No tiene un referente."
        println("Nombre: $name\nEdad: $age\nLe gusta $hobby. $referrerInfo")
    }
}
