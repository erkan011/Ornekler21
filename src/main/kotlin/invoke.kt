class Hesaplama {
    operator fun invoke(x: Int, y:Int): Int {
        return x+y
    }
}

fun main() {
    val hesaplama = Hesaplama()
    val sonuc = hesaplama(5,9)
    println("Toplam: $sonuc")
}