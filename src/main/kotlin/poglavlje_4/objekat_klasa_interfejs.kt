package poglavlje_4

interface klik{
    fun klik()
}

object dugme:klik{
    var brojac=0
    override fun klik() {
        println("Dugme je kliknuto ${++brojac} puta")
    }
}
open class ParentKlasa(){
    open fun callMySingelton(){
    println("Parent klasa je pozvana")
    }
}

object MySingelton:ParentKlasa(){
    override fun callMySingelton() {
        super.callMySingelton()
        println("MySingelton je pozvana")
    }
}
fun objInterClass(){
    dugme.klik()

    MySingelton.callMySingelton()
}
