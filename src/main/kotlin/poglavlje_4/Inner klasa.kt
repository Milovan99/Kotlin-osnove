package poglavlje_4

class Outer{
    var out="Spoljasnja klasa"
    var counter=0

    fun info(){
        println("Funckija spoljasnje klase")
    }

    inner class Nested{
        val nest ="Nested klasa"
        var counter = 0

        fun info(){
            //this@Outer.info()
            println("Funkcija unutrasnje klase")
        }

        fun incrementCounter(){
            this@Outer.counter++
        }
    }
}

fun innerClas(){
    var outerObj=Outer()

    var nestedObj=outerObj.Nested()

    println("Spoljasnji counter pre povecanja " +outerObj.counter)
    nestedObj.incrementCounter()
    println("Spoljasnji counter posle povecanja " +outerObj.counter)

}