package poglavlje_4

class Student(private val ime:String , private val predmeti:List<predmet>){
    init {
        require(!predmeti.isEmpty()){"Nema podataka o ispitima"}
    }
    fun studentInfo(){
        println("================================================")
        println("Sutdent:${ime} Reultati polaganja")
        println("================================================")
        for(predmet in predmeti){
            println("Naziv predmeta: ${predmet.nazivpredmet}  ocena: ${predmet.ocena}")
        }
    }

}
class predmet(val nazivpredmet: String,val ocena :Int)

fun ispiti(){
    val programiranje=predmet("Programiranje",10)
    val menadzment = predmet("Menadzment",10)
    val dizajn = predmet("Graficki dizajn",10)

    val predmeti = listOf(programiranje,menadzment,dizajn)
    val milovan = Student("Milovan Jakovljevic",predmeti)

    milovan.studentInfo()
}