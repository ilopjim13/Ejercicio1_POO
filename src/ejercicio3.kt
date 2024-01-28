import java.lang.IllegalArgumentException

class Rectangulo(base:Double, altura:Double) {
    var base:Double = 0.0
        set(value) {
            require(value>0) { "La base no puede ser 0" }
            field = value
        }
    var altura:Double = 0.0
        set(value) {
            require(value>0) { "La altura no puede ser 0" }
            field = value
        }
    init {
        this.base = base
        this.altura = altura
    }

    private fun area() = this.base * this.altura


    private fun perimetro() =  (this.base * 2) + (this.altura * 2)


    override fun toString(): String {
        return "El área del rectangulo es de ${String.format("%.2f", area())}cm y su perímetro de ${String.format("%.2f", perimetro())}cm"
    }
}

fun main() {
    try {
        val rect1 = Rectangulo(3.7,5.4)
        println("Rectangulo 1:")
        println(rect1)

        val rect2 = Rectangulo(4.2,3.8)
        println("\nRectangulo 2:")
        println(rect2.toString())

        val rect3 = Rectangulo(6.9,13.2)
        println("\nRectangulo 3:")
        println(rect3.toString())

        val rect4 = Rectangulo(9.45,4.98)
        println("\nRectangulo 4:")
        println(rect4.toString())
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

}