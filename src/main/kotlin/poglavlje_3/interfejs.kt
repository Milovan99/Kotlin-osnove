package poglavlje_3

interface Ispis{
    fun print()
}
class Faktura : Ispis{
    override fun print() {
        println("Faktrura je ispisana")
    }
}

interface Klik{
    fun klik()
}
class Dugme:Klik{
    override fun klik() {
        println("Dugme je kliknuto")
    }
}
fun interfejs(){
    var faktura=Faktura()
    faktura.print()
    var dugme=Dugme()
    dugme.klik()
}