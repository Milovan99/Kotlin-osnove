package poglavlje_3

open class A(){
    init {
        println("Klasa A je inicijalizovana")
    }
}

open class B:A(){
    init {
        println("Klasa B je inicijalizovana")
    }
}

class C:B(){
    init {
        println("Klasa C je inicijalizovana")
    }
}

fun hijerarhija(){
    val c=C()
    println(c)
}