package com.google.inheritance

fun main(args: Array<String>) {

    /* so one thing to keep in mind is that you can't initialise interfaces in Kt.

    You have to initialise the interface as an instance of class to use its embedded functions.

    Nota bene
     */

    println("""This simple Kotlin program instantiates a Television lcass,
        and an interface that serves as its remote, along with all of the
        cool Kotlin antics""")

    var remote: RemoteControl = Television()

    remote.eteintLaTelevision()

    //off

    remote.allumeLaTelevision()

    //on

    remote.eteintLaTelevision()
    //off again, c'est termine!

    remote.about()



}

interface RemoteControl {

    //you don't need to use the keyword abstract, this is automatic in Kt func def

    fun allumeLaTelevision()

    fun eteintLaTelevision()

    open fun about() {
        println("This is a remote control for this TV class")
    }

}



class Television: RemoteControl {

    override fun allumeLaTelevision() {
        //...
        println("The television is now allumeeeeeeeee. Put Game of Thrones onnn")

    }

    override fun eteintLaTelevision() {
        //
        println("The television is now 'eteinte'. Go meditate or something. Who still watches cable anyway")

    }

    override fun about() {
        super.about()
        println("This is the class-native about function, try using super to use the other one")
    }


}