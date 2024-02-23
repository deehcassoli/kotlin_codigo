fun main() {
    linhaSomaFor()
    reduzindoFor()
    ate50For() 
}

fun ate50For() {
    println()
    for (i in 1..50) {
       print("$i ")
    }
}

fun reduzindoFor() {
    for (i in 50 downTo 1) {
        print("$i ")
    }
}


fun linhaSomaFor() {
    var soma = 0
    for (i in 1..3) {
        print(i)
        soma += i 
    }
    println("Soma: $soma")
}