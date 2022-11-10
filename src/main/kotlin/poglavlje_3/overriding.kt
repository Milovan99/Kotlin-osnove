package poglavlje_3

open class OsobaOver(ime:String,godine:Int){
    var ime = ime
    var godine = godine
   open fun prikazi(){
        println("${ime} ima ${godine} godina")
    }
}
open class Student(ime: String,godine: Int,id:Int,obrazovanje:String,fakultet:String):OsobaOver(ime,godine){
    var studentId=id
    var obrazovanje=obrazovanje
    var fakultet=fakultet

    final override fun prikazi(){
        super.prikazi()
        println("Ja sam student ${obrazovanje} na ${fakultet} i moj id je ${studentId}")
    }
}

//sudent prikazi() je final tako da ne moze biti prepravljena
/*class Vanzemaljac(ime: String,godine: Int,id:Int,obrazovanje:String,fakultet:String):Student(ime,godine,id,obrazovanje,fakultet){
    override  fun prikazi(){
        super.prikazi()
        println("Znam sve")
    }
}
 */

fun override(){
    val student=Student("Milovan",23,2304,"It menadzer","Tehnicki fakultet Mihajlo Pupin")
    student.prikazi()
}