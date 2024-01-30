/**
 * Clase persona
 * @param peso :Double peso de la persona
 * @param altura :Double altura de la persona
 */
class Persona(peso: Double, altura: Double) {

    var peso = peso
        set(value) {
            require(value > 0) { "El peso no puede ser negativo" }
            field = value
        }
    var altura: Double = altura

    var nombre:String? = "persona"
        set(value) {
            require(!value.isNullOrBlank()) { "EL nombre no puede ser nulo ni vacío." }
            field = value
        }

    val imc: Double
        get() = peso / altura

    constructor(nombre:String, peso:Double, altura:Double) : this(peso, altura) {
        this.nombre = nombre
    }

    /**
     * Muestar por pantalla la informacion de la persona
     */
    override fun toString(): String {
        return "${this.nombre} tiene un peso de ${this.peso}, una altura de ${this.altura} y un imc de ${String.format("%.2f",this.imc)}"
    }

    /**
     * Compara si las dos personas son iguales o no
     */
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Persona) return false

        if (this.nombre != other.nombre) return false
        if (this.altura != other.altura) return false
        if (this.peso != other.peso) return false
        return true
    }



}