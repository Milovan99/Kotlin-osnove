package poglavlje_2

class Osoba(val ime:String,var godine:Int,var visina:Double){
    fun pricanje(){
        println("Moje ime je $ime , imam $godine godina i moja visina je $visina")
    }
    fun spavanje(){
        println("Zzzzzz")
    }
    fun eat(){
        println("Jedem 10 u pola s lukom")
    }
    fun info():String{
        return "Moje ime je $ime , imam $godine godina i moja visina je $visina"
    }

    fun pozdrav(poruka:String){
        println("Moje ime je $ime.... $poruka")
    }
}

fun klasaIFunkcija(){
    val milovan = Osoba(ime = "Milovan",23,190.3)
    milovan.pozdrav("Zdravo")

    val info = milovan.info()
    println(info)
}

class Auto(val marka:String,val boja:String,val cena:Int){
    fun kreni(){
        println("Auto $marka $boja boje se krece")
    }
    fun stani(){
        println("Auto $marka $boja boje stoji")
    }
    fun info():String{
return "Auto $marka $boja boje kosta $cena e"
    }
    fun poruka(poruka:String){
        println("Auto $marka $boja boje .... $poruka")
    }
}

fun auto(){
    val audi = Auto("Audi","Crne",10000)
    audi.kreni()
    val info = audi.info()
    audi.poruka("Brmmm Brmmm")
}
