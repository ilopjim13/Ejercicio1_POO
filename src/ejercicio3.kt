class Rectangulo(private val base:Double, private val altura:Double) {

    private fun area(): Double {
        return this.base * this.altura
    }

    private fun perimetro(): Double {
        return (this.base * 2) + (this.altura * 2)
    }

    override fun toString(): String {
        return "El área del rectangulo es de ${String.format("%.2f", area())}cm y su perímetro de ${String.format("%.2f", perimetro())}cm"
    }
}

fun main() {
    val rect1 = Rectangulo(3.7,5.4)
    println("Rectangulo 1:")
    println(rect1.toString())

    val rect2 = Rectangulo(4.2,3.8)
    println("\nRectangulo 2:")
    println(rect2.toString())

    val rect3 = Rectangulo(6.9,13.2)
    println("\nRectangulo 3:")
    println(rect3.toString())

    val rect4 = Rectangulo(9.45,4.98)
    println("\nRectangulo 4:")
    println(rect4.toString())
}