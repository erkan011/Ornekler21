fun main() {
    val startTime = System.currentTimeMillis()
    Thread.sleep(2000)
    val endTime = System.currentTimeMillis()
    val elapseTime = endTime - startTime
    println("İşlem tamamlandı. Geçen süre: $elapseTime milisaniye")
}