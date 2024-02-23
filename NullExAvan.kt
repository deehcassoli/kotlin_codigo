import java.lang.ArithmeticException
import java.lang.Exception
import java.lang.NullPointerException

fun main() {
    try {
        val stringvazia: String? = null
        println(stringvazia!!.length) // NullPointerException
        println(1 / 0) // ArithmeticException
    } catch (e: ArithmeticException) {
        println("Divisão por zero!")
    } catch (e: NullPointerException) {
        println("NullPointer!!")
    } catch (e: Exception) {
        println("Outro problema nao previsto.")
    } finally {
        println("Finalmente!")
    }

}
