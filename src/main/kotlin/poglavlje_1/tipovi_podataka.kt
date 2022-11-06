package poglavlje_1

fun osnovniTipovi(ime:String,godine:Int,visina:Double){
    println("Ime: $ime, Godine: $godine, Visina:$visina ")
}
/*
fun deklaracija(){
    // Varijable se mogu eksplicitno inicijalizirati
    var ime :String

    //inicijalizacija
    ime="Milovan"

    // deklaracija i inicijalizacija u jednom redu

    var mojInt : Int = 23 //32-bita integer
    var mojLong :Long = 55  //64-bita integer
    var mojShort :Short = 22  //16-bita integer
    var mojByte :Byte = -128 //8-bita integer

    // Deklaracija double i float

    var h1=5.10
    var h2:Double = 5.10

    var f1=5.10f
    var f2:Float=5.10f

}
 */
fun tipPodatakaMinIMax(){
    println("Maksimalni integer je "+Integer.MAX_VALUE)
    println("Minimalni integer je "+Integer.MIN_VALUE)

    println("Maksimalni byte je "+ Byte.MAX_VALUE)
    println("Minimalni byte je "+Byte.MIN_VALUE)

    println("Maksimalni short je "+ Short.MAX_VALUE)
    println("Minimalni short je "+ Short.MIN_VALUE)

    println("Maksimalni long je "+ Long.MAX_VALUE)
    println("Minimalni long je "+ Long.MIN_VALUE)
}

//Bool tip podataka

fun bool(prviBroj:Int,drugiBroj:Int){
    var rezultat:Boolean

    rezultat=prviBroj==drugiBroj
    println("$prviBroj je jednak sa $drugiBroj=$rezultat")

    rezultat=prviBroj>drugiBroj
    println("$prviBroj je veci od $drugiBroj=$rezultat")

    rezultat=drugiBroj<prviBroj
    println("$prviBroj je veci od $drugiBroj=$rezultat ")

}
fun displayUniCode() {

    var ch = '\u0030'

    var i = 0
    while (i < 81){
        print(" ${ch++} ")
        i++
    }
}