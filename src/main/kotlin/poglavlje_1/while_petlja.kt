package poglavlje_1

fun whilePetlja() {
    var i = 1
    while (i <= 3) {
        println("Ispis $i.put")
        i++
    }

    //ugnezdena while petlja

    i = 1

    while (i <= 3) {
        var j = 1
        while (j <= 3) {
            println("$i , $j")
            j++
        }
        i++
    }

    //do while

    i = 5
    do {
        println("$i")
        i--
    } while (i > 0)

    println("komparacija izmedju do while i while")

    i = 4
    while (i <= 3) {
        println("While $i")
        i++
    }

   var j = 4
    do {
        println("Do While $j")
    } while (j <= 3)

}