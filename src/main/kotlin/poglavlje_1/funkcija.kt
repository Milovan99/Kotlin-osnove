package poglavlje_1

fun pozdrav() {
    println("Zdravo Kotlin ovde")
}

fun poruka(poruka:String):String{
    return("poruka :$poruka")
}
fun sabiranje(a:Int,b:Int):Int{
    val k = a+b
    return k
}

fun sabiranjeEx(a:Int,b:Int)=a+b

fun veciBrojEx(a:Int,b:Int)=
    if(a>=b){
        a
    }else{
        b
    }

fun definisaniParametar(poruka:String="definisano"){
    println("Poruka: $poruka")
}

fun ispisiKolekciju(list: List<String>){
    for (item in list){
        print("$item ")
    }
    println()
}
fun saberiBrojeve(brojevi:List<Int>){
    var zbir = 0
    for(broj in brojevi){
        zbir+=broj
    }
    println("Zbir brojeva je $zbir")
}

fun varargString(vararg list:String){
    for(item in list){
        println(item)
    }
}

fun mesanePromenjive(vararg list:Any){
    for(item in list){
        if(item is String) println("$item je String")
        else if(item is Int) println("$item je Integer")
        else if(item is Double) println("$item je Double")
        else if(item is Float) println("$item je Float")
        else println("$item je Vanzemaljac")

    }
}

fun parovi(sekunde:Int):Pair<Int,Int>{
    val sati = sekunde/3600
    val minute=(sekunde%3600)/60
    return Pair(sati,minute)
}
fun timeConversionTriple(seconds: Int): Triple<Int,Int,Int> {

    val hour = seconds/3600
    val minutes = (seconds % 3600) / 60
    val sec =  seconds % 60

    return Triple(hour,minutes, sec)
}

fun display(myTriple: Triple<Int,Int,Int>) {

    println("${myTriple.first} Hour(s) ${myTriple.second} Minute(s) ${myTriple.third} Second(s)")
}