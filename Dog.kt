class Dog(weight: Double, name: String) : Animal(weight, name) {
    fun bark() {
        println("$name лает.")
    }
}