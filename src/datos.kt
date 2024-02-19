const val pi = 3.14159265

fun main(){
    val number1 = 2.5
    print("number1 - Tipo de dato asignado por defecto: ")
    println(number1::class.simpleName)

    val number2 = number1.toFloat()
    print("number2 - double a float : ")
    println(number2::class.simpleName)

    val result = 2 * pi * number2

    println("El perímetro del círculo es: $result.")

    println("La ecuación de la pendiente se obtiene por la siguiente expresión:\nm = y2-y1/x2-x1")

    val x1 = 4
    val x2 = -3
    val y1 = 3
    val y2 = -2

    println("Caso 1:")
    val m = (y2-y1)/(x2-x1)
    println("La pendiente es $m")

    println("Caso 2:")
    val denominator = x2 - x1
    //val denominator = 0
    if (denominator != 0){
        val m = (y2 - y1) / denominator.toDouble()
        println("La pendiente es $m")
    }else{
        println("La pendiente no está definida | División por cero.")
    }

    println("¿Por qué el resultado obtenido difiere del resultado esperado?")
    print("Se necesita crear una medida en caso de que la división sea entre cero. \nLa verificación de división entre cero es una buena práctica de programación, nos ayuda a crear programas más estables.")

}