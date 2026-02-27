fun calcularSoma(numeros: IntArray): Int {
    var acumulador = 0
    for (numero in numeros) {
        acumulador += numero
    }
    return acumulador
}

fun main() {
    val lista = intArrayOf(1, 2, 3, 4)
    println(calcularSoma(lista))
}
