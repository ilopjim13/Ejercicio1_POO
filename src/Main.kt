fun main() {
    val persona1 = Persona(67.87, 1.78)
    val persona2 = Persona("Pepe",86.13, 1.98)
    val persona3 = Persona("Elias",79.6, 1.93)

    try {
        print("Persona1 introduzca su nombre: ")
        persona1.nombre = readln()
        println(persona1)
    } catch (e:Exception) {
        println(e.message)
    }

    println(persona3)
    persona3.altura = 1.80
    println(persona3)

    persona2.altura = 1.80
    println(persona2)
    println(persona3)
    if (persona2.equals(persona3)) println("Estas dos personas son iguales")
    else println("Estas personas no son iguales")
}