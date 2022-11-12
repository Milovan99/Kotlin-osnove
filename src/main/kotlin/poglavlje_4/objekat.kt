package poglavlje_4

class Dugme{
    var brojac = 0

    fun klik(){
        println("Dugme je kliknuto ${++brojac} puta")
    }
}

fun objekat(){
    val dugme=Dugme()
    dugme.klik()
}