package poglavlje_1

fun forPetalja(){
    val domen= 1..3
    for (broj in domen){
        print("$broj ")
    }
    println()

    val lista= listOf(1,2,3,4,5)
    for (l in lista){
        print("$l ")
    }
    println()

    val tekst ="Milo"
    for (slovo in tekst){
        println(slovo)
    }
}

fun ugnezdenaForPetlja(){
   for(i in 1..3){
       for(j in 1..3){
           println("$i , $j")
       }
   }

}

fun prekid(){
    println("Break")
    for (i in 1..10) {
        print("For $i ")

        if (i == 5) {
            break
        }
    }
    var i =1
    while(i<=10){
        println("While $i")
        i++
        if (i==2){
            break
        }
    }
    for(i in 1..3){
        for (j in 1..3){
            println("$i , $j")
            if(i==j){
                break
            }
        }
    }
}

fun lable(){
    outLoop@ for (i in 1..3) {
        for (j in 1..3) {
            if(i==2 && j==2) {
                break@outLoop
            }
            println("$i , $j")
        }
    }
}

fun continueFor() {
    for (i in 1..3) {
        for (j in 1..3) {
            if(i==2 && j==2) {
                continue
            }
            println("$i , $j")
        }
    }


    println("Labled For Loop")
    outLoop@ for (i in 1..3) {
        for (j in 1..3) {
            if(i==2 && j==2) {
                continue@outLoop
            }
            println("$i , $j")
        }
    }
}