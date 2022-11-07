package poglavlje_1

fun typecasting(){
    //kreiranje byte vrednosti
    var byteValue:Byte=10
    var anotherByteValue:Byte = byteValue

    println("Byte vredonst je $byteValue a druga byte vrednost je $anotherByteValue")

    var intValue :Int

    //intValue = byteValue  -  Nije dozvoljeno
    //intaValue = (Int) byteValue  - Takodje nije dozvoljeno

    //Pravilno
    intValue =byteValue.toInt()
    println("int od byte vrdnosti = $intValue")

    //Double to Int
    var doubleValue :Double = 5.8
    intValue = doubleValue.toInt()
    println("Double vrednost $doubleValue u int vrednost =$intValue")

    //String u int je moguce sa tim sto cemo ubaciti NumberFormateException  ako string nema validan broj

    var stringValue : String = "123"
    intValue = stringValue.toInt()
    println ("String vrednost $stringValue u int vrednost")

    //Koristimo Safe Call ako String nema validan unos

    stringValue = "1A3"
    var i :Int?=stringValue.toIntOrNull()
    if(i is Int){
        println("Od $stringValue dobijamo int $i")
    }else{
        println("String nije validan")
    }
    var any:Any? =null
    any="String"
    any=432 //integer
    any=233.32 //Double

    mySmartCast(8)
    mySmartCast("Milovan")
    mySmartCast(any=null)
    mySmartCast(3.43)

    myUnsafeCast("Hello unsafe")
    myUnsafeCast(null)
    myUnsafeCast(2)
}
fun myUnsafeCast(any: Any?){
    // This is fine but will throw ClassCastException if value is not string, Add make the string nullable String?
    //val s : String = any as String

    val s :String?=any as? String
    println(s)
}
fun mySmartCast(any:Any?){
    if (any is Int){
        var i = any +5
        println("Vrednost je integer i u zbiru sa 5 iznosi $i")
    }else if(any is String){
        var str = "Zdravo "+any
        println("Vrednost je String $str")
    }else if(any is Double){
        var doub = 3.44+any
        println("Vrednost je Double $doub")
    }else if(any== null){
        println("Objekat ima vrednos null")
    }
}