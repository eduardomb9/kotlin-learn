open class Animal(
    val familia: String,
    val especie: String
) {
}

class Cachorro(familia: String, especie: String) : Animal(
    familia, especie
) {
}

fun main() {
    val animal = Animal("sponge", "bob")

    val cachorro = Cachorro("Canis", "familiaris")
    println(animal.especie)
    println(cachorro.especie)
}