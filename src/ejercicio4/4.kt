fun main() {
    val Amanda = Person("Amanda", 33, "playing tennis", null)
    val Atiqah = Person("Atiqah", 28, "climbing", Amanda)
    Amanda.showProfile()
    Atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        val referrerInfo = referrer?.let { "Their referrer is ${it.name}, who enjoys ${it.hobby}." }
            ?: "They have no referrer."
        println("Name: $name\nAge: $age\nThey like $hobby. $referrerInfo")

    }
}
