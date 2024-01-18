class Tiempo (private var hora:Int) {
    private var minutos:Int = 0
    private var segundos:Int = 0

    constructor(hora: Int, minutos: Int) : this(hora) {
        this.minutos = minutos
    }

    constructor(hora: Int, minutos: Int, segundos: Int) : this(hora) {
        this.minutos = minutos
        this.segundos = segundos
    }

    override fun toString(): String {
        return "${this.hora}h ${this.minutos}m ${this.segundos}s"
    }


    fun setHora(hora: Int) {
        if (hora > 24) {
            println("La hora no puede ser mayor a 24")
            print("Introduce la hora: ")
            this.setHora(readln().toInt())
        }
    }

    fun setMinutos(minutos: Int) {
        this.minutos = minutos
        do {
           this.minutos -= 60
           this.hora += 1
        } while (this.minutos >= 60)
    }

    fun setSegundos(segundos: Int) {
        this.segundos = segundos
        do {
            this.segundos -= 60
            this.minutos += 1
        } while (this.segundos >= 60)
    }

}

fun main() {
    val hora1 = Tiempo(1)
    print("Introduce la hora: ")
    hora1.setHora(readln().toInt())
    print("Introduce los minutos: ")
    hora1.setMinutos(readln().toInt())
    print("Introduce los segundos: ")
    hora1.setSegundos(readln().toInt())

    println(hora1.toString())

    val hora2 = Tiempo(1,2)
    println(hora2.toString())

    val hora3 = Tiempo(1,2,3)
    println(hora3.toString())

}