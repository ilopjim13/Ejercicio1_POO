class Coche(color:String, marca: String, modelo: String, caballos: Int, puertas: Int, matricula: String) {
    private var color:String = ""
    private var marca:String = ""
    private var modelo: String = ""
    private var caballos:Int = 0
    private var puertas:Int = 0
    private var matricula:String = ""

    fun getColor():String {
        return this.color.uppercase()
    }

    fun setColor(color:String) {
        if (color.isNotEmpty() && color.isNotBlank()) this.color = color
    }

    fun getMarca() = this.marca.uppercase()

    fun setMarca(marca:String) {
        if (marca.isNotEmpty()) this.marca = marca
    }

    fun getModelo() = this.modelo.uppercase()

    fun setModelo(modelo:String) {
        if (modelo.isNotEmpty()) this.modelo = modelo
    }

    fun getCaballos() = this.caballos

    fun setCaballos(caballos:Int) {
        if (caballos !in 70..700) {
            println("Los caballos deben ser mayor a 70 y menor a 700.")
            print("Introduce los caballos del coche: ")
            this.setCaballos(readln().toInt())
        }
        else this.caballos = caballos
    }

    fun getPuertas() = this.puertas

    fun setPuertas(puertas:Int) {

        try {
            require(puertas in 3..5) {"Las puertas no puede ser inferior a 3 ni mayor a 5."}
        } catch (e: Exception) {
            println("Las puertas no puede ser inferior a 3 ni mayor a 5.")
            print("Introduce las puertas del coche: ")
            this.setPuertas(readln().toInt())
        }

        this.puertas = puertas
    }

    fun getMatricula() = this.matricula.uppercase()

    fun setMatricula(matricula:String) {
        if (matricula.isNotEmpty()) this.matricula = matricula
    }

    override fun toString() = "Este coche es un ${this.getMarca()} ${this.getModelo()} de color ${this.getColor()}, con ${this.getCaballos()} caballos de potencia, ${this.getPuertas()} puertas y con mátricula ${this.getMatricula()}"


}

fun main() {
    val coche1 = Coche("","","",300,3,"")

    print("Introduce el color del coche: ")
    coche1.setColor(readln())
    print("Introduce la marca del coche: ")
    coche1.setMarca(readln())
    print("Introduce el modelo del coche: ")
    coche1.setModelo(readln())
    print("Introduce los caballos del coche: ")
    coche1.setCaballos(readln().toInt())
    print("Introduce las puertas del coche: ")
    coche1.setPuertas(readln().toInt())
    print("Introduce la matrícula del coche: ")
    coche1.setMatricula(readln())

    println(coche1.toString())

}