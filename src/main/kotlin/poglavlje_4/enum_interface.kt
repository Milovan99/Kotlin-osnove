package poglavlje_4

interface stampa{
    fun prikazi()
}

enum class vesti : stampa{
    north {
        override fun prikazi() {
            println("Can you explain me what is summer")
        }
    },
    east {
        override fun prikazi() {
            println("Can you explain me what is cold")
        }
    }, west {
        override fun prikazi() {
            println("I know what is winter and summer.")
        }
    }, south {
        override fun prikazi() {
            println("Oh .. its humid here...")
        }
    }
}
fun enumclass(){
    val novost=vesti.valueOf("north")
    novost.prikazi()
}
