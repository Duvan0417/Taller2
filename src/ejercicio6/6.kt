package ejercicio6

fun main() {
    val winningBid = Bid(5000, "Coleccionista Privado")
    println("El artículo A se ha vendido por ${auctionPrice(winningBid, 3500)}.")
    println("El artículo B se ha vendido por ${auctionPrice(null, 4000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    return bid?.amount ?: minimumPrice
}
