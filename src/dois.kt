fun main(){
    val numero = 0

    when {
        numero > 0 -> println("O numero $numero é positivo.")
        numero < 0 -> println("O numero $numero é negativo.")
        else -> println("O numero é zero.")
    }
}