fun main(){
    val numero = readln().toLong()

    println("tabuada do $numero:")
    println("------------------")

    for (i in 1 .. 10) {
        val resultado = numero * i
        println("$numero x $i = $resultado")
    }
}