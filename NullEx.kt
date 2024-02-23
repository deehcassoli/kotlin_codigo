fun main() {

    // Kotlin não permite atribuir nulo a variável
    // var str: String = null

    // Deixa explícito que a variável pode ser nula
    val stringNula: String? = null

    // 
    println(stringNula?.length)

    // !! quando quer ter certeza que a variável não é nula
    print(stringNula!!.length)



}