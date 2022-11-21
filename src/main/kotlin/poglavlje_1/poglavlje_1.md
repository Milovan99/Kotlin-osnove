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
