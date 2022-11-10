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

class Automobil(tip: String,brojPutnika: Int,val model:String):prevoznoSredstvo(tip,brojPutnika){
    fun voznjaCestom(){
        println("Auto ${model} se krece cestom")
    }
}
class Brod : prevoznoSredstvo{
    constructor(tip: String,brojPutnika: Int):super(tip,brojPutnika)
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
    val auto=Automobil("Auto",5,"Audi")
    val brod=Brod("Brod",15)
    val avion =Avion("Avion",100)
    auto.voznjaCestom()
    brod.info()
    avion.voznjaNebom()
}

