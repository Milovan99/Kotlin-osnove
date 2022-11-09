package poglavlje_2

class Person(val ime:String,var godine:Int,var visina:Double){
    fun pricanje(){
        println("Moje ime je $ime , imam $godine godina i moja visina je $visina")
    }
    fun spavanje(){
        println("Zzzzzz")
    }
    fun eat(){
        println("Jedem 10 u pola s lukom")
    }
    fun info():String{
        return "Moje ime je $ime , imam $godine godina i moja visina je $visina"
    }

    fun pozdrav(poruka:String){
        println("Moje ime je $ime.... $poruka")
    }

    fun pozdrav(){
        println("Pozdrav moje ime je $ime ... Drago mi je sto smo se upoznali")
    }
}

fun overl(){
    val milovan = Person("Milovan",23,190.5)
    milovan.pozdrav()
    milovan.pozdrav("Zdravo")
}

class Digitron{
    fun saberi(a:Int ,b:Int) = a+b
    fun saberi(a:Double,b:Double)=a+b
    fun saberi(a:Float,b:Float)=a+b
    fun max(a:Int,b:Int)= if(a>b){
        a
    }else {
       b
    }
    fun max(a:Double,b:Double)= if(a>b){
       a
    }else {
       b
    }
}

fun digitron(){
    val dig= Digitron()
    println(dig.saberi(2,3))
    println(dig.saberi(2.5,3.5))
    println(dig.saberi(2.5f,3.5f))

    val veciInt=dig.max(5,5)

    println(veciInt)
    println(dig.max(5.5,5.0))
}