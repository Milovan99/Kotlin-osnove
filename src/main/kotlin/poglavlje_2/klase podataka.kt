package poglavlje_2

import poglavlje_1.ime

//to String()

class Osoba2(var ime:String = "Milovan", val godine:Int=23){}

fun toStr(){
    val milovan=Osoba2()
    println("Ime je ${milovan.ime} a godine su ${milovan.godine}")
    println(milovan.toString())
}
//operator jednakosti

fun jednakost(){
    val djole = Osoba2(ime="Djole", godine = 22)
    val nikola = Osoba2(ime="Djole", godine = 22)

    if(djole==nikola){
        println("Osobe su iste")
    }else{
        println("Osobe nisu iste")
    }

    if(djole.equals(nikola)){
        println("Osobe su iste")
}else{
    println("Osobe nisu iste")
}

}

//funkcija kopiranja

fun copy(){
    val djole = Osoba2(ime="Djole", godine = 22)
    val nikola = djole

    println(djole.ime)
    nikola.ime="Nikola"
    println(djole.ime)
    println("Objekti ukazuju na istu lokaciju ${djole===nikola}")

    if(djole==nikola){
        println("Obe osobe su iste")
    }
}
//dekompozicija

fun dekompozicija(){
    data class Osoba(val ime:String,val godine: Int,val visina:Int)
    val abid = Osoba("Abid", 40, 190)
    val (name, age, height) = abid
    println("name=${abid.component1()} " +
            "age=${abid.component2()} " +
            "height=${abid.component3()}")

}
//Hash kod

fun hash(){
    data class Osoba(val ime:String,val godine: Int,val visina:Int)
    val p1 = Osoba("Abid", 40, 190)
    val p2 = Osoba("Abid", 40, 190)
    val p3 = Osoba("Abid", 40, 190)

    val set = hashSetOf(p1,p2,p3)
    println ("Set sadrdzi ${set.size} elemenata")

    val result = set.contains(Osoba("Abid",40,190))
    println("Search result = $result")
}