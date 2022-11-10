package poglavlje_2

class OsobaSec(ime:String,godine:Int){
    var ime :String
    var godine :Int
    var visina :Double

    init {
        this.ime = ime
        this.godine=godine
        this.visina=192.3
    }

    constructor(ime:String,godine: Int,visina:Double):this(ime,godine){
    this.visina=visina
    }
}
fun osobaSec(){
    val milovan=OsobaSec(ime="Milovan", godine = 23, visina = 192.0)
    println("Ime ${milovan.ime},godine ${milovan.godine},visina ${milovan.visina}")
}

class Proizvod(ime:String,kategorija:String){
    var ime :String
    var kategorija :String
    var cena :Double
    var kolicina :Int

    init {
        this.ime=ime
        this.kategorija=kategorija
        this.cena=0.0
        this.kolicina=0
    }
    constructor(ime:String,kategorija: String,cena:Double):this(ime,kategorija){
        this.cena=cena
    }
    constructor(ime:String,kategorija: String,cena:Double,kolicina:Int):this(ime,kategorija,cena){
        this.kolicina=kolicina
    }
}
fun proizvod(){
    var telefon = Proizvod("Samsung","Telefon")
    println("Naziv proizvoda:${telefon.ime},kategorija:${telefon.kategorija}")
    var iphon=Proizvod("Iphon","Telefon",1000.0,1)
    println("Naziv proizvoda:${iphon.ime},kategorija:${iphon.kategorija},cena:${iphon.cena},kolicina:${iphon.kolicina}")
}