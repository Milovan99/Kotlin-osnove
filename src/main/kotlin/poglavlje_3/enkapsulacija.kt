package poglavlje_3

class OsobaEn(ime:String,godine:Int,visina:Double){
    private var ime :String=ime
    private var godine :Int=godine
    private var visina:Double=visina
    init {
        require(ime.trim().isNotEmpty()){"Ime nije uneto"}
        require(godine>0){"Godine nisu pravilno unete"}
        require(visina>0.0){"Visina nije pravilno uneta"}
    }
    fun getGodine():Int{
        return godine
    }
    fun setGodine(godine: Int){
        this.godine=godine

    }
    fun prikazi(){
        println("Osoba se zove ${ime} ima ${godine} godina i visina je ${visina}")
    }
}

fun enkaps(){
    var milovan = OsobaEn("Milovan",23,190.5)
    println(milovan.getGodine())
    milovan.setGodine(24)
    milovan.prikazi()
}