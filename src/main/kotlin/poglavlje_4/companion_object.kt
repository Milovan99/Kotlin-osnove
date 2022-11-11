package poglavlje_4

class  Parent{
    companion object Static{
        const val count = 10
    fun compaionFunction(){
        println("I am your companion")
    }

    }
    fun getCompanion(){
        return compaionFunction()
    }

    fun memberFunction(){
        println("I am member function")
    }

}
fun companion(){
    Parent.compaionFunction()
    println(Parent.count)
    val comp = Parent()
    comp.getCompanion()
    comp.memberFunction()
}