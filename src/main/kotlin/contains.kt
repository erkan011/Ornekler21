fun main() {
    val liste = listOf("elma","armut","kiraz")
    if (liste.contains("armut")){
        println("Liste de armut içeriyor")
    }else{
        println("liste de armut içermiyor")
    }
    if (liste.contains("karpuz")){
        println("liste de karpuz var")
    }else{
        println("liste de karpuz yok")
    }
}