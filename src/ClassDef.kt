fun main(args: Array<String>) {


    var dog = Dog()

    dog.Color = "Blue"
    dog.breed = "yorkshire"

    dog.noise()
    dog.Eat()

    //and now for the catte

    println("""And this is the noise
        a catte makes! ->
    """.trimMargin())

    var cat = Catte()

    cat.noise()

}

open class Animal {

    var breed: String = " "
    var Color: String = " "

    open fun noise() {

        println("Woof woofe!")
    }

    open fun Eat() {

        println("i'm eating this stuff man, don't bother me")
    }
}


class Dog : Animal() {

    override fun noise() {

        println("Woof woofe!")
    }

    override fun Eat() {

        println("i'm eating this stuff man, don't bother me")
    }
}

class Catte : Animal() {

    var age: Int = -1

    override fun noise() {

        println("Meow mew")
    }

    override fun Eat() {

        println("i'm eating this cat food man, don't bother me either")
    }
}