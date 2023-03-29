// Exemplo básico de uma suspend functions com Coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    doWorld()
}

suspend fun doWorld() = coroutineScope {
    launch {
        delay(1000L)
        println("World!")
    }
    print("Hello ")
}