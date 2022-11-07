package poglavlje_1

fun nullSafety(){
    var notNull :String = "Zdravo"
    // notNull = null - nije dopusteno

    var len = notNull.length
    println("Vrednost je $notNull i duzina je $len")

    var mayBeNull :String?
    mayBeNull=null //dopusteno
    print(mayBeNull)

}

fun safeCall(mayBeNull:String?){

    var mayBeLen = 0
    if(mayBeNull!=null && mayBeNull.length>0){
        mayBeLen=mayBeNull.length
    }
    //Safe call
    var lenght = mayBeNull?.length
    println("Duzina vrednosti je $lenght")
}

//Elvis operator

fun elvisOperator(){
    var rec :String ?
    rec = null

    val duzina=rec?.length ?: 0
    println("Rec ima $duzina karaktera")


}
//Sure operator

fun sure(){
    var sureOrNot : String? = null

   // var lenght =sureOrNot!!.length //aplikacija ce se srusiti
   // println(lenght)

    var ch1 :Char?="abc".lastOrNull()

    var ch2:Char="xzy".lastOrNull()!!
    println("ch1=$ch1 i ch2=$ch2")
}