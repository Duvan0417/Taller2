package ejercicio6

fun main() {
    val winningBid = Bid(5000, "Coleccionista Privado")
    println("Item A has been sold for ${auctionPrice(winningBid, 5000)}.")
    println("Item B has been sold for ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    return bid?.amount ?: minimumPrice
}
