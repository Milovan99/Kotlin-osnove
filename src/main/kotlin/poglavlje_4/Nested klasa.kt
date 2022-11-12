package poglavlje_4

class OuterKlass{
    var out = "Spoljasnja klasa"
    fun info(){
        println("Funkcija spoljasnje klase")
    }
    fun getNestedClass():NestedClass{
        return NestedClass()
    }
    class NestedClass{
        val nested = "Nested klasa"

        fun info(){
            println("FUnkcija nested klase")
        }
    }
}

fun nestedKlasa(){
    var outerObj=OuterKlass()
    println(outerObj.out)
    outerObj.info()

    var nestedObj = OuterKlass.NestedClass()
    println(nestedObj.nested)
    nestedObj.info()

    nestedObj=outerObj.getNestedClass()
    println(nestedObj.nested)
    nestedObj.info()
}