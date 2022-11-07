package poglavlje_1

//Aritmeticki operatori
fun aritOp(){
    var i = 10
    var j = 15

    var k = i+j
    println("$i + $j = $k")

    k=i.plus(j)
    println("$i + $j = $k")


}
//Slozeni operatori
fun compOp(){
    var i =12
    var j =33

    i = i + j
    println("i je jednoko=$i")

    i=12
    i+=j
    println("i je jednoako=$i")

}

fun comOp2(){
    var i =1

    i+=1 //povecava vrednost i za 1
    println("i je jednoako=$i")
    i-=1 //smanjuje vrednost i za 1
    println("i je jednoako=$i")
    i++ //increment
    println("i je jednoako=$i")
    i-- //decrement
    println("i je jednoako=$i")
}

//increment operator
fun increment(){
    var i = 2
    var j = 3

    j = i++

    println ("Vrednost i je $i")
    println ("Vrednost j je $j")

    i=1
    j=++i
    println ("Vrednost i je $i")
    println ("Vrednost j je $j")


    println(i.inc())
    println(j.inc())
    println ("Vrednost i je $i")
    println ("Vrednost j je $j")

}

//referencijalna jednacia
class Point{
    var pointX:Int =0
    var pointY:Int=0
}
fun jednac(){
    val p1 = Point()
    p1.pointX=10
    p1.pointY=20

    val p2=Point()
    p2.pointX=30
    p2.pointY=40

    println(p1.pointY===p2.pointY)//false
    println(p1!==p2)//true

    var p3=p1
    println(p1===p3)//true

// razlika izmedju == i === operatora je sto == proverava da li su vrednosti jednake dok === proverava da li je referenca na objekat ista

}

//and operator

fun and(){
    var i : Boolean = true
    var j : Boolean =false
    var k : Boolean = true

    var rezultat : Boolean
    rezultat = i&&j //false
    println("$i AND $j = $rezultat")

    rezultat = i and k
    println("$i AND $k =$rezultat")//true

    var a = 40
    var b = 30
    var c = 20

    if ((a>b) and (a>c)){
        println("a=$a je veci od $b i $c")

    }
}

//or operator

fun or(){
    var i : Boolean = true
    var j :Boolean = false
    var k :Boolean=true
    var l :Boolean = false

    var rezultat : Boolean

    rezultat = i || j //true
    println("i= $i OR j=$j = $rezultat")

    rezultat = i || k //true
    println("i= $i OR k=$k = $rezultat")

    rezultat = j || l //false
    println("i= $i OR l=$l = $rezultat")

    var a = 40
    var b= 45
    var c=20

    if ((a>b) or (a>c)){
        println("a je veci od b ili c ili od oba")
    }

}
fun xor() {
    var i : Boolean = true
    var j : Boolean = false
    var result : Boolean
    result = i xor j
    println ("$i XOR $j = $result")
    i = true
    j = true
    result = i xor j
    println ("$i XOR $j = $result")
    i = false
    j = false
    result = i xor j
    println ("$i XOR $j = $result")
}

fun shift(){
    var number =5
    var count = 1

    var result=number.shl(1)
    println("$number : Posle levog pomeraja  $count puta = $result") //shl pomera bitove u levu stranu

     result=number shl 1
    println("$number : Posle levog pomeraja  $count puta = $result") //shl pomera bitove u levu stranu

    result = number.shr(count)
    println("$number : Posle desnog pomeraja $count times = $result")//shr pomera bitove u desnu stranu

    number = -4
    count = 2

    result = number shr count
    println("$number : Posle desnog pomeraja $count times = $result")

    result = number ushr count
    println("$number : Posle desnog pomeraja sa znakom $count times = $result")
}