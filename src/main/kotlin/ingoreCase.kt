fun main() {
    val kelime1 = "Merhaba"
    val kelime2 = "MERHABA"
    if (kelime1.equals(kelime2, ignoreCase = false)){
        println("Kelimeler eşit.")
    }else{
        println("kelimeler eşit değil") // ignoreCase false iken kelimeler eşit değil.
    }
}

//fun main() {
//    val kelime1 = "Merhaba"
//    val kelime2 = "MERHABA"
//    if (kelime1.equals(kelime2, ignoreCase = true)){
//        println("Kelimeler eşit.")
//    }else{
//        println("kelimeler eşit değil") // ignoreCase true iken kelimeler eşit.
//    }
//}