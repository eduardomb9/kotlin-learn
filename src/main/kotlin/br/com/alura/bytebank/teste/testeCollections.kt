package br.com.alura.bytebank.teste

fun testeCollections() {
    val iteravel : Iterable<String> = listOf("Pedro", "Maria", "Alex", "Paulo")
    val collection : Collection<String> = listOf("Pedro", "Maria", "Alex", "Paulo")

    println("iterable.contains: ${iteravel.contains("Alex")}")
    println("collection.size: ${collection.size}")

    val banco = BancoDeNomes()
    val nomes = banco.nomes as Collection<String>
//    nomes.add("Paulo") // nao pode mais usar uma mutable
    banco.salva("Alex")
    println(banco.nomes)
    println(BancoDeNomes().nomes)
    println(nomes)
}

class BancoDeNomes {

    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados: MutableList<String> = mutableListOf()
    }
}