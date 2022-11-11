package poglavlje_4

import kotlin.reflect.KProperty

class Osoba(){
    val ime :String by DelegateImeOsobe()
    var godine:Int by DelegateGodineOsobe()
}
class DelegateImeOsobe(){
    private val vrednost:String="Default"
    operator fun getValue(osoba: Osoba,property: KProperty<*>):String{
        println("Property ${property.name}")
        println(osoba.toString())
        return vrednost
    }
}

class DelegateGodineOsobe(){
    var godine :Int=0
    operator fun getValue(osoba:Osoba,property:KProperty<*>):Int{
        return godine
    }
    operator fun setValue(osoba: Osoba,property: KProperty<*>,i:Int){
        println("Ime klase ${osoba}")
        println("Propery: ${property.name}")
        godine=i
    }
}


fun delegation(){
    val osoba=Osoba()
    osoba.ime
    println(osoba.godine)
    osoba.godine=40
    println(osoba.godine)
}