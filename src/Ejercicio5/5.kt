
open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}


class FoldablePhone(var isFolded: Boolean = true) : Phone() {

    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
            println("The screen is now on.")
        } else {
            println("Cannot turn on the screen while the phone is folded.")
        }
    }

    fun fold() {
        isFolded = true
        println("The phone is now folded.")
    }

    fun unfold() {
        isFolded = false
        println("The phone is now unfolded.")
    }
}


fun main() {
    val myFoldablePhone = FoldablePhone()

    myFoldablePhone.checkPhoneScreenLight()
    myFoldablePhone.switchOn()
    myFoldablePhone.unfold()
    myFoldablePhone.switchOn()
    myFoldablePhone.checkPhoneScreenLight()
    myFoldablePhone.fold()
    myFoldablePhone.switchOff()
}
