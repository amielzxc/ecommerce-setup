package entities

import interfaces.CartInterface

class Cart(
    override var productsList: MutableList<Pair<Product, Int>> = mutableListOf()
): CartInterface {
}