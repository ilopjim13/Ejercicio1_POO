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


    fun setHora(hora: String) {
        if (hora.toInt() > 24) {
            println("La hora no puede ser mayor a 24")
            print("Introduce la hora: ")
            this.setHora(readln())
        }
    }

    fun setMinutos(minutos: String) {
        try {
            this.minutos = minutos.toInt()
            while (this.minutos >= 60) {
               this.minutos -= 60
               this.hora += 1
            }
        } catch (e:Exception) {
            println("Error los segundos introducidos no son válidos.")
            print("Introduce los segundos: ")
            this.setMinutos(readln())
        }
    }

    fun setSegundos(segundos: String) {
        try {
            this.segundos = segundos.toInt()
            while (this.segundos >= 60) {
                this.segundos -= 60
                this.minutos += 1
            }
        } catch (e:Exception) {
            println("Error los segundos introducidos no son válidos.")
            print("Introduce los segundos: ")
            this.setSegundos(readln())
        }

    }

}

fun main() {
        val hora1 = Tiempo(1)
        print("Introduce la hora: ")
        hora1.setHora(readln())
        print("Introduce los minutos: ")
        hora1.setMinutos(readln())
        print("Introduce los segundos: ")
        hora1.setSegundos(readln())

        println(hora1.toString())

        val hora2 = Tiempo(1,2)
        println(hora2.toString())

        val hora3 = Tiempo(1,2,3)
        println(hora3.toString())
}