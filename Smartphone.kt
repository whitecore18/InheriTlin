open class Smartphone(val brand: String, val model: String, val batteryCapacity: Int) {
    fun call() {
        println("Звоню с $brand $model.")
    }
}