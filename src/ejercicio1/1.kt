fun main() {
    val morningNotification = 51
    val eveningNotification = 135
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100) {
        println("Tienes $numberOfMessages notificaciones.")
    } else {
        println("¡Tu teléfono está que explota! Tienes 199+ notificaciones.")
    }
}
