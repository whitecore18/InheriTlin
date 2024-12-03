class Cat(weight: Double, name: String) : Animal(weight, name) {
    fun meow() {
        println("$name мяукает.")
    }
}