package poglavlje_1

// if else statment funkcija ce proveriti da li se zovete Milovan
fun ime(ime:String) {

    if ( ime == "Milovan" ) {
        println ("Zdravo $ime")
    }else{
        println("Vi niste Milovan")
    }
}
// if else if funkcija ce proveriti koju marku auta vozite . P.S ako je vase auto Alfa nema ljutnje ;)
fun markaAuta(marka:String){
    if(marka == "Audi"){
        println("Vozite audija")

    }
    else if (marka == "BMW"){
        println("Vozite BMW-a")
    }
    else if (marka == "Opel"){
        println("Vozite Opel-a")
    }
    else if(marka == "Alfa"){
        println("Verovanto vam je auto kod majstora")
    }
    else{
        println("Vozite $marka")
    }
}
// if with and funkcija proverava dva uslova u jednom koraku u kom oba moraju biti tacna
fun dizanjeIzBedza(kila:Int){
    if( kila > 132){
        println("Vi ste Chris Bumstead")
    }else if(kila >= 99 && kila <132){
        println("Napredno svaka cast")
    }else if(kila >= 70 && kila < 99 ){
        println("Prosecna kilaza")
    }else if( kila >= 47 && kila < 70){
        println("Napredujete ali tek ste poceli")
    }else{
        println("Trenutno ste pocetnik , samo nastavite trenirati ;)")
    }
}
//if with or funkcija ce ukoliko jedan od zahteva nije ispunjen vratiti ocenu 5
fun ocena(pristustvo:Int,kolokvijum:Int,ispit:Int){
    var ocena : Int = pristustvo+kolokvijum+ispit

    if ((pristustvo < 5) or (kolokvijum < 10) or (ispit < 36)){
        ocena = 5
    }else{
        if(ocena >= 90){
            ocena =10
        }else if(ocena >=80){
            ocena = 9
        }else if(ocena >=70){
            ocena = 8
        }else if(ocena >=60){
            ocena = 7
        }else {
            ocena = 6
        }
    }
    println("Student je zasluzio ocenu $ocena")

}
//if with not funkcija proverava da li uslov nije tacan
fun lozinka(lozinka:String){
    if(lozinka != "Vazduh trepti ko da nebo gori"){
        println("Pogresna lozinka ... probajte ponovo")
    }else{
        println("Sprema se oluja")
    }
}
//range operator funckcija ce kreirati niz na osnovu prosledjenih argumenata i ispisace niz
fun nizBrojeva(pocetakNiza:Int,krajNiza:Int){
    val niz=pocetakNiza..krajNiza
    for(n in niz){
        print("$n ")
    }
    println()
}

//if as expresion

fun ocena(bodovi:Int){
    val ocena = if(bodovi >=91){
         10
    }else if(bodovi >= 81){
        9
    }else if (bodovi >= 71){
        8
    }else if(bodovi >= 61){
        7
    }else if(bodovi >= 51){
        6
    }else{
        5
    }
    println("Ocena je :$ocena")

}
//when expresion
fun danUNedelji(dan:Int){
    when(dan){
        1->println("Ponedeljak")
        2->println("Utorak")
        3->println("Sreda")
        4->println("Cetvrtak")
        5->println("Petak")
        6->println("Subota")
        7->println("Nedelja")
        else->println("U sedmici ima 7 dana , izmenite broj dana")
    }
}
fun tacniOdgovori(odgovor:Char){
    when(odgovor){
        'a','b','c'-> println("Odgovor nije tacan")
        'd' ->println("Odgovor je tacan")
        else -> println("Vas odgovor je nevazeci")
    }
}

fun cifaraUBroju(broj:Int){
    when(broj){
        in 1..9->println("Broj je jednocifren")
        in 10..99 ->println("Broj je dvocifren")
        in 100..999 -> println("Broj je trocifren")
        else->println("Program ispituje samo do trocifrenog broja , vas broj je veci")
    }
}