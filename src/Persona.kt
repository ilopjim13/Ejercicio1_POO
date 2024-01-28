
class Persona(peso: Double, altura: Double) {

    var peso = peso
        set(value) {
            require(value > 0) { "El peso no puede ser negativo" }
            field = value
        }
    var altura: Double = altura

    var nombre:String = ""

    var imc: Double = 0.0
    init {
        this.imc = peso / altura
    }

    constructor(nombre:String, peso:Double, altura:Double) : this(peso, altura) {
        this.nombre = nombre
    }

}