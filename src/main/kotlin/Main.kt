import entities.Product

fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")

    val prod1 = Product("Moby", 10, 1)
    Product("Milo", 10, 2)
    Product("Cheezy", 10, 3)
    Product("Nova", 10, 4)
    Product("Piattos", 10, 5)

    println(prod1.getProdName())
    println(prod1.getProdPrice())
    println(prod1.getProdId())
}