import kotlinx.coroutines.*
suspend fun main() {
    var Classica = Classica()
    println("Дай значение, человек")
    var n = readln().toInt()

    GlobalScope.launch {
        for (i in 0..n)
        {
            Classica.Hell()
        }
        delay(5000L)
    }
    Classica.Hell()
    println("Пусто :(")
    delay(10000L)
}