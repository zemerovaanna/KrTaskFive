import kotlinx.coroutines.*
suspend fun main() = coroutineScope{
    try
    {
        var Milk = Milk()
        GlobalScope.launch{
            println("Введите число:")
            var n = readln()!!.toByte()
            for(i in 0..n){
                delay(1000L)
                Milk.composition()
            }
            println("Молоко")
            runBlocking{
                delay(2000L)
            }
        }
    }
    catch (e:NumberFormatExeption){

    }
}