package poglavlje_2

class konstruktor {
    var ime :String ="Milovan"
    var godine:Int = 23
    var visina:Double = 190.5

}
fun pozoviKonst(){
    val osoba01 = konstruktor()
    println("${osoba01.ime} ima ${osoba01.godine} godine i visok je ${osoba01.visina}")

    val osoba02 = konstruktor()
    println("${osoba02.ime} ima ${osoba02.godine} godine i visok je ${osoba02.visina}")

    osoba02.ime="Djordje"
    osoba02.godine=24
    println("${osoba02.ime} ima ${osoba02.godine} godine i visok je ${osoba02.visina}")

}

class primarni_konstruktor(val ime:String, val godine:Int, val visina:Double)

//primarni konstruktor sa constructor kljucnom reci
//class primarni_konstruktor constructor(val name:String,val godine:Int,val visina:Double){}
fun pozPrimarniKonst(){
    val milovan = primarni_konstruktor(ime = "Milovan",23,190.5)
    println("Ime ${milovan.ime} , godine ${milovan.godine}, vosina ${milovan.visina}")
    val igor = primarni_konstruktor(ime = "Igor",23,190.5)
    println("Ime ${igor.ime} , godine ${igor.godine}, vosina ${igor.visina}")
}
//primarni konstruktor sa konstruktorski parametrima
class OsobaK(oIme:String,oGodine:Int,oVisina:Double){
    val ime :String = oIme
    val godine:Int=oGodine
    val visina:Double=oVisina
}
fun pozoviPKonstSaP() {
    val osoba01 = OsobaK("Milovan",23,190.5)
    println("${osoba01.ime} ima ${osoba01.godine} godine i visok je ${osoba01.visina}")

}
class OsobaKsaInit(oIme:String,oGodine:Int,oVisina:Double){
    val ime :String
    val godine:Int
    val visina:Double
    init{
        ime = oIme
        godine = oGodine
        visina = oVisina

        require(ime.trim().isNotEmpty()){"Ime je neophodno"}
        require(godine >0 ){"Godine nisu tacno unete"}
        require(visina>0.0){"Visina nije tacno uneta"}
    }
}

fun konstSaInit(){
    val osoba = OsobaKsaInit("Milovan",23,5.5)
    println("${osoba.ime} ima ${osoba.godine} godine i visok je ${osoba.visina}")

}

class konstSaThis(oIme:String,oGodine: Int,oVisina: Double){
    var ime :String
    var godine :Int
    var visina :Double

    init {
        this.ime=oIme
        this.godine=oGodine
        this.visina=oVisina


    }
}
fun konstSaInitIThis(){
    val osoba = konstSaThis("Milovan",23,5.5)
    println("${osoba.ime} ima ${osoba.godine} godine i visok je ${osoba.visina}")

}