package poglavlje_2

import poglavlje_1.ime

class OsobaSaZadanimPar(val ime:String,val visina:Double=190.5,val tezina:Double=73.5,val godine:Int=23){}

fun saZadPar(){
    val djole = OsobaSaZadanimPar("Djole")
    println("${djole.ime} je visok ${djole.visina} tezak ${djole.tezina} i ima ${djole.godine}")

    val nikola =OsobaSaZadanimPar(ime="Nikola", visina = 180.0, tezina = 70.0)
    println("${nikola.ime} je visok ${nikola.visina} tezak ${nikola.tezina} i ima ${nikola.godine}")
}