
class Persona(val peso: Double, val altura: Double) {

    var nombre:String = ""

    var imc: Double
    init {
        this.imc = peso / altura
    }

    constructor(nombre:String, peso:Double, altura:Double) : this(peso, altura) {
        this.nombre = nombre
    }

}

fun main() {
    val persona1 = Persona(67.87, 1.78)
    val persona2 = Persona("Pepe",86.13, 1.98)
    val persona3 = Persona("Elias",79.6, 1.93)

    print("Persona1 introduzca su nombre: ")
    persona1.nombre = readln()

    println("${persona2.nombre} pesa ${persona2.peso}Kg y mide ${persona2.altura}m")

    persona3.imc = persona3.peso / (persona3.altura * persona3.altura)
    println("El indice de masa corporal de ${persona3.nombre} es ${persona3.imc}")
}