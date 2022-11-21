For petlja



Petlja for iterira kroz sve što pruža iterator. Ovo je ekvivalentno foreach petlji u jezicima kao što je C#. Sintaksa for je sljedeća:

for (item in collection) print(item)

Tijelo for može biti blok.

for (item: Int in ints) {
    // ...
}

Za ponavljanje niza brojeva koristite izraz raspona:

for (i in 1..3) {
    println(i)
}
for (i in 6 downTo 0 step 2) {
    println(i)
}


Petlja for preko raspona ili niza se kompajlira u petlju baziranu na indeksu koja ne kreira objekt iteratora.

Ako želite iterirati niz ili listu s indeksom, to možete učiniti na sljedeći način:

for (i in array.indices) {
    println(array[i])
}

Alternativno, možete koristiti funkciju biblioteke withIndex:

for ((index, value) in array.withIndex()) {
    println("the element at $index is $value")
}


Kotlin funkcije su deklarirane pomoću funključne riječi:

fun double(x: Int): Int {
    return 2 * x
}
Upotreba funkcije﻿
Funkcije se pozivaju koristeći standardni pristup:

val result = double(2)
Pozivanje funkcija člana koristi notaciju tačaka:

Stream().read() // create instance of class Stream and call read()
Parametri﻿
Parametri funkcije su definirani korištenjem Pascal notacije - ime : tip . Parametri su odvojeni zarezima, a svaki parametar mora biti eksplicitno upisan:

fun powerOf(number: Int, exponent: Int): Int { /*...*/ }
Možete koristiti zadnji zarez kada deklarirate parametre funkcije:

fun powerOf(
    number: Int,
    exponent: Int, // trailing comma
) { /*...*/ }
Zadani argumenti﻿
Parametri funkcije mogu imati zadane vrijednosti, koje se koriste kada preskočite odgovarajući argument. Ovo smanjuje broj preopterećenja:

fun read(
    b: ByteArray,
    off: Int = 0,
    len: Int = b.size,
) { /*...*/ }
Zadana vrijednost se postavlja dodavanjem =tipu.

Metode nadjačavanja uvijek koriste zadane vrijednosti parametara osnovne metode. Prilikom nadjačavanja metode koja ima zadane vrijednosti parametara, zadane vrijednosti parametara moraju biti izostavljene iz potpisa:

open class A {
    open fun foo(i: Int = 10) { /*...*/ }
}

class B : A() {
    override fun foo(i: Int) { /*...*/ }  // No default value is allowed.
}
Ako zadani parametar prethodi parametru bez zadane vrijednosti, zadana vrijednost se može koristiti samo pozivom funkcije s imenovanim argumentima :

fun foo(
    bar: Int = 0,
    baz: Int,
) { /*...*/ }

foo(baz = 1) // The default value bar = 0 is used
Ako je posljednji argument nakon zadanih parametara lambda , možete ga proslijediti ili kao imenovani argument ili izvan zagrada :

fun foo(
    bar: Int = 0,
    baz: Int = 1,
    qux: () -> Unit,
) { /*...*/ }

foo(1) { println("hello") }     // Uses the default value baz = 1
foo(qux = { println("hello") }) // Uses both default values bar = 0 and baz = 1
foo { println("hello") }        // Uses both default values bar = 0 and baz = 1
Imenovani argumenti﻿
Možete imenovati jedan ili više argumenata funkcije kada je pozivate. Ovo može biti od pomoći kada funkcija ima mnogo argumenata i kada je teško povezati vrijednost s argumentom, posebno ako je to boolean ili nullvrijednost.

Kada koristite imenovane argumente u pozivu funkcije, možete slobodno promijeniti redoslijed u kojem su navedeni. Ako želite koristiti njihove zadane vrijednosti, možete jednostavno izostaviti ove argumente u potpunosti.

Razmotrite reformat()funkciju koja ima 4 argumenta sa zadanim vrijednostima.

fun reformat(
    str: String,
    normalizeCase: Boolean = true,
    upperCaseFirstLetter: Boolean = true,
    divideByCamelHumps: Boolean = false,
    wordSeparator: Char = ' ',
) { /*...*/ }
Kada pozivate ovu funkciju, ne morate imenovati sve njene argumente:

reformat(
    "String!",
    false,
    upperCaseFirstLetter = false,
    divideByCamelHumps = true,
    '_'
)
Možete preskočiti sve one sa zadanim vrijednostima:

reformat("This is a long String!")
Također možete preskočiti određene argumente sa zadanim vrijednostima, umjesto da ih sve izostavite. Međutim, nakon prvog preskočenog argumenta, morate imenovati sve sljedeće argumente:

reformat("This is a short String!", upperCaseFirstLetter = false, wordSeparator = '_')
Možete proslijediti promjenjiv broj argumenata ( vararg) s imenima koristeći spreadoperator:

fun foo(vararg strings: String) { /*...*/ }

foo(strings = *arrayOf("a", "b", "c"))
Kada pozivate Java funkcije na JVM-u, ne možete koristiti sintaksu imenovanog argumenata jer Java bajt-kod ne čuva uvijek imena parametara funkcije.

Funkcije vraćanja jedinica﻿
Ako funkcija ne vraća korisnu vrijednost, njen tip vraćanja je Unit. Unitje tip sa samo jednom vrijednošću - Unit. Ova vrijednost ne mora biti eksplicitno vraćena:

fun printHello(name: String?): Unit {
    if (name != null)
        println("Hello $name")
    else
        println("Hi there!")
    // `return Unit` or `return` is optional
}
Deklaracija Unittipa vraćanja je također opciona. Gornji kod je ekvivalentan:

fun printHello(name: String?) { ... }
Funkcije jednog izraza﻿
Kada funkcija vrati jedan izraz, vitičaste zagrade se mogu izostaviti, a tijelo je navedeno nakon =simbola:

fun double(x: Int): Int = x * 2
Eksplicitno deklarisanje tipa povratka je opciono kada prevodilac to može zaključiti:

fun double(x: Int) = x * 2
Eksplicitni tipovi povrata﻿
Funkcije s tijelom bloka uvijek moraju eksplicitno specificirati tipove povrata, osim ako im je namijenjeno da vrate Unit, u kom slučaju je specificiranje povratnog tipa opciono .

Kotlin ne zaključuje tipove povratka za funkcije sa tijelima bloka jer takve funkcije mogu imati složen tok kontrole u tijelu, a tip povratka neće biti očigledan za čitaoca (a ponekad čak i za kompajler).

Varijabilni broj argumenata (varargs)﻿
Možete označiti parametar funkcije (obično posljednji) varargmodifikatorom:

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}
U ovom slučaju, možete proslijediti promjenjiv broj argumenata funkciji:

val list = asList(1, 2, 3)
Unutar funkcije, vararg-parametar tipa Tje vidljiv kao niz T, kao u gornjem primjeru, gdje tsvarijabla ima tip Array<out T>.

Samo jedan parametar može biti označen kao vararg. Ako varargparametar nije posljednji na listi, vrijednosti za sljedeće parametre mogu se proslijediti korištenjem sintakse imenovanih argumenata, ili, ako parametar ima tip funkcije, prosljeđivanjem lambda izvan zagrada.

Kada pozovete vararg-funkciju, argumente možete proslijediti pojedinačno, na primjer asList(1, 2, 3). Ako već imate niz i želite da prenesete njegov sadržaj funkciji, koristite operator širenja (prefiks nizu sa *):

val a = arrayOf(1, 2, 3)
val list = asList(-1, 0, *a, 4)
Ako želite proslediti niz primitivnih tipova u vararg, morate ga konvertovati u regularni (ukucani) niz pomoću toTypedArray()funkcije:

val a = intArrayOf(1, 2, 3) // IntArray is a primitive type array
val list = asList(-1, 0, *a.toTypedArray(), 4)
Infiksna notacija﻿
Funkcije označene infixključnom riječi također se mogu pozvati pomoću infiksne notacije (izostavljajući tačku i zagrade za poziv). Infix funkcije moraju ispunjavati sljedeće zahtjeve:

To moraju biti funkcije člana ili funkcije proširenja .

Moraju imati jedan parametar.

Parametar ne smije prihvatiti varijabilni broj argumenata i ne smije imati zadanu vrijednost .

infix fun Int.shl(x: Int): Int { ... }

// calling the function using the infix notation
1 shl 2

// is the same as
1.shl(2)
Pozivi infiksnih funkcija imaju niži prioritet od aritmetičkih operatora, izmjena tipa i rangeTooperatora. Sljedeći izrazi su ekvivalentni:

1 shl 2 + 3je ekvivalentno1 shl (2 + 3)

0 until n * 2je ekvivalentno0 until (n * 2)

xs union ys as Set<*>je ekvivalentnoxs union (ys as Set<*>)

S druge strane, prioritet poziva infiksne funkcije je veći od prioriteta logičkih operatora &&i ||, is- i in-checks i nekih drugih operatora. Ovi izrazi su također ekvivalentni:

a && b xor cje ekvivalentnoa && (b xor c)

a xor b in cje ekvivalentno(a xor b) in c

Imajte na umu da infiksne funkcije uvijek zahtijevaju da se specificiraju i prijemnik i parametar. Kada pozivate metodu na trenutnom prijemniku koristeći infiksnu notaciju, koristite thiseksplicitno. Ovo je potrebno kako bi se osiguralo nedvosmisleno raščlanjivanje.

class MyStringCollection {
    infix fun add(s: String) { /*...*/ }

    fun build() {
        this add "abc"   // Correct
        add("abc")       // Correct
        //add "abc"        // Incorrect: the receiver must be specified
    }
}
Opseg funkcije﻿
Kotlin funkcije se mogu deklarirati na najvišem nivou u datoteci, što znači da ne morate kreirati klasu da biste držali funkciju, što se od vas traži u jezicima kao što su Java, C# i Scala ( definicija najvišeg nivoa je dostupna od Scala 3 ). Pored funkcija najvišeg nivoa, Kotlin funkcije se također mogu deklarirati lokalno kao funkcije članova i funkcije proširenja.

Lokalne funkcije﻿
Kotlin podržava lokalne funkcije, koje su funkcije unutar drugih funkcija:

fun dfs(graph: Graph) {
    fun dfs(current: Vertex, visited: MutableSet<Vertex>) {
        if (!visited.add(current)) return
        for (v in current.neighbors)
            dfs(v, visited)
    }

    dfs(graph.vertices[0], HashSet())
}
Lokalna funkcija može pristupiti lokalnim varijablama vanjskih funkcija (zatvaranje). U gornjem slučaju, visitedmože biti lokalna varijabla:

fun dfs(graph: Graph) {
    val visited = HashSet<Vertex>()
    fun dfs(current: Vertex) {
        if (!visited.add(current)) return
        for (v in current.neighbors)
            dfs(v)
    }

    dfs(graph.vertices[0])
}
Funkcije članova﻿
Članska funkcija je funkcija koja je definirana unutar klase ili objekta:

class Sample {
    fun foo() { print("Foo") }
}
Funkcije članova se pozivaju s tačkom:

Sample().foo() // creates instance of class Sample and calls foo
Za više informacija o klasama i nadjačavajućim članovima pogledajte Klase i nasljeđivanje .

Generičke funkcije﻿
Funkcije mogu imati generičke parametre, koji su specificirani pomoću ugaonih zagrada prije naziva funkcije:

fun <T> singletonList(item: T): List<T> { /*...*/ }
Za više informacija o generičkim funkcijama pogledajte Generike .

Rep rekurzivne funkcije﻿
Kotlin podržava stil funkcionalnog programiranja poznat kao repna rekurzija . Za neke algoritme koji bi normalno koristili petlje, umjesto toga možete koristiti rekurzivnu funkciju bez rizika od prelijevanja steka. Kada je funkcija označena tailrecmodifikatorom i ispunjava tražene formalne uslove, kompajler optimizuje rekurziju, ostavljajući za sobom brzu i efikasnu verziju zasnovanu na petlji:

val eps = 1E-10 // "good enough", could be 10^-15

tailrec fun findFixPoint(x: Double = 1.0): Double =
    if (Math.abs(x - Math.cos(x)) < eps) x else findFixPoint(Math.cos(x))
Ovaj kod izračunava fixpointkosinus, koji je matematička konstanta. Jednostavno poziva Math.cosviše puta počevši od 1.0sve dok se rezultat više ne mijenja, dajući rezultat od 0.7390851332151611za specificiranu epspreciznost. Rezultirajući kod je ekvivalentan ovom tradicionalnijem stilu:

val eps = 1E-10 // "good enough", could be 10^-15

private fun findFixPoint(): Double {
    var x = 1.0
    while (true) {
        val y = Math.cos(x)
        if (Math.abs(x - y) < eps) return x
        x = Math.cos(x)
    }
}
Da bi bila podobna za tailrecmodifikator, funkcija mora pozvati sebe kao posljednju operaciju koju izvodi. Ne možete koristiti repnu rekurziju kada ima više koda nakon rekurzivnog poziva, unutar try/ catch/ finallyblokova ili na otvorenim funkcijama. Trenutno, rep rekurziju podržava Kotlin za JVM i Kotlin/Native.

Vidi također :

