package poglavlje_3

open class prevoznoSredstvo(val tip:String,val brojPutnika:Int){
    fun info(){
        println("Tip preboznog sredstva je ${tip} i moze da preveze ${brojPutnika} putnika ")
    }
    fun kreni(){
        println("${tip} se krece")
    }
    fun stani(){
        println("${tip} stoji")
    }
}

class Automobil(tip: String,brojPutnika: Int):prevoznoSredstvo(tip,brojPutnika){
    fun voznjaCestom(){
        println("Auto se krece cestom")
    }
}
class Brod(tip: String,brojPutnika: Int):prevoznoSredstvo(tip,brojPutnika){
    fun voznjaVodom(){
        println("Brod se krece vodom")
    }
}
class Avion(tip: String,brojPutnika: Int):prevoznoSredstvo(tip,brojPutnika){
    fun voznjaNebom(){
        println("Avion se krece u zraku")
    }
}

fun prevoz(){
    val auto=Automobil("Auto",5)
    val brod=Brod("Brod",15)
    val avion =Avion("Avion",100)
    auto.info()
    brod.kreni()
    avion.voznjaNebom()
}

