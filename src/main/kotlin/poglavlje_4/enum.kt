package poglavlje_4

enum class Boja{
    Crvena,
    Plava,
    Zelena,
    Crna
}

enum class US(val ukupnaPovrsina:Double,val povrsinaZemlje:Double){
    NEWYORKL(141_297.0,122_057.0),
    VIRGINIA    (110_787.0, 102_279.0) ,
    HAWAII      (28_313.0,    16_635.0),
    NEWJERSEY   (22_591.0, 19_047.0) ;

    fun getPovrsinuVode()=ukupnaPovrsina-povrsinaZemlje
}

enum class Sedminca(val value:Int){
    MONDAY(2 ) ,TUESDAY(4),WEDNESDAY(6),THURSDAY(8),FRIDAY(10), SATURDAY(12), SUNDAY(14)
}
fun enum(){
    println(Boja.Crvena)
    println(Boja.Crvena.name)
    println(Boja.Crvena.ordinal)

    val boja=Boja.valueOf("Crvena")
    println(boja.name)
    println(boja.ordinal)

    val sedmica = Sedminca.valueOf("MONDAY")
    println("Tip : ${sedmica}")
    println("Ime ${sedmica.name}")
    println("Vrednost ${sedmica.value}")

    println()
    for (state in US.values()){
        println("${state} ukupna povrsina je ${state.ukupnaPovrsina} i povrsina zemlje je ${state.povrsinaZemlje}")
        println("Povrsina vode je "+state.getPovrsinuVode())
    }
}