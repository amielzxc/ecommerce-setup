package entities

import interfaces.ProductInterface

class Product(
    override val productName: String,
    override val price: Int,
    override val productId: Int
) : ProductInterface {


    fun getProdName(): String {
        return productName
    }

    fun getProdPrice(): Int {
        return price
    }

    fun getProdId(): Int {
        return productId
    }

}

