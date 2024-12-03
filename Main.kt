fun main() {

    // Задача 1: Животные
    // Создание объектов Dog и Cat
    val dog = Dog(30.0, "Бобик")
    dog.eat()
    dog.bark()

    val cat = Cat(5.0, "Мурка")
    cat.eat()
    cat.meow()

    // Задача 2: Телефоны смартфоны
    // Создание объектов Nokia и Sony
    val nokia = Nokia("3310", 1000)
    nokia.call()
    nokia.useNokiaFeatures()

    val sony = Sony("Xperia", 3000)
    sony.call()
    sony.useSonyFeatures()

    // Задача 3: Обработка массива целых чисел
    val numbers = intArrayOf(3, 67, 1, 55, 65, 89, 23)
    println("Элементы массива, которые делятся на 5 нацело:")
    for (number in numbers) {
        if (number % 5 == 0) {
            println(number)
        }
    }
}