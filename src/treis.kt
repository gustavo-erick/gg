fun main() {
   val idade = readln().toInt()

    val classificacao = when (idade) {
        in 0 .. 11 -> "crianca"
        in 12 .. 17 -> "adolecente"
        in 18 .. 59 -> "adulto"
        in 60 .. 118 -> "idoso"
        else -> "idade invalido"
    }

    println("")
}