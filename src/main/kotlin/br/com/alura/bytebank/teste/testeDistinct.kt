package br.com.alura.bytebank.teste

fun testeDistinct() {
    val assistiramCursoAndroid = listOf("Alex", "Gui", "Paulo", "Maria")
    val assistiramCursoKotlin = listOf("Alex", "Pedro", "Maria")
//    val assistiramAmbos = (assistiramCursoAndroid + assistiramCursoKotlin).distinct()
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)

    println(assistiramCursoAndroid + assistiramCursoKotlin)

    println(assistiramAmbos)
    println(assistiramCursoAndroid union assistiramCursoKotlin)
    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)
    println(assistiramCursoAndroid intersect assistiramCursoKotlin)
    val assistiramLista = assistiramCursoAndroid.toMutableList()
    assistiramLista.add("Alex")
    println(assistiramLista)
    println(assistiramLista.toSet())
}

