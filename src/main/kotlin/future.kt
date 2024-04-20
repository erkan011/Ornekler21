import java.util.concurrent.Executors
import java.util.concurrent.Future

fun main() {
    val executor = Executors.newSingleThreadExecutor()

    val futureResult: Future<Int> = executor.submit<Int>{
        Thread.sleep(2000) // 2 saniye bekleyelim
        42 // İşlem sonucu olarak 42 döndürüyoruz
    }
    val result = futureResult.get()
    println("Asenkron işlem tamamlandı. Sonuç: $result")
    executor.shutdown()
}