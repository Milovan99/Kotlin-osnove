package poglavlje_3

abstract class Osoba(val ime:String,val godine:Int,val visina:Double) {

    fun pozdrav(){
        println("Pozdrav moje ime je $ime")
    }

    fun upoznavanje(){
        println("Pozdrav moje ime je $ime , imam $godine godina i visok sam $visina")
    }
}

class Zaposleni(ime:String,godine: Int,visina: Double,val pozicija:String):Osoba(ime,godine,visina){
    fun pozicija(){
        println("Radim kao $pozicija")
    }

}

fun apstrakcija(){
    val zaposlenik = Zaposleni("Milovan",23,190.5,"Programer")
    zaposlenik.pozdrav()
    zaposlenik.upoznavanje()
    zaposlenik.pozicija()
}


abstract class Auto(val marka:String,val godiste:Int,val cena:Double){
    fun info(){
        println("Radi se o autu marke $marka,godista $godiste i cena je $cena")
    }
    fun kreni(){
        println ("Auto $marka se krece")
    }
    fun stani(){
        println ("Auto $marka je stalo")
    }
}

class audi_a4(marka: String,godiste: Int,cena: Double,val model:String,val kubikaza:Int):Auto(marka,godiste,cena){
    fun oModelu(){
        println("Auto $marka modela $model i kubikaza je $kubikaza")
    }
}

fun autoEx(){
    val audiA4=audi_a4("Audi",2008,7000.0,"A4",1968)
    audiA4.info()
    audiA4.kreni()
    audiA4.oModelu()
}