package poglavlje_4

class Ljubimac(val ime:String,val vrsta:String,var vlasnik:Vlasnik?){
fun ljubimacInfo(){
    println("Ljubimac se zove ${ime} i on je ${vrsta}.Njegov vlasnik se zove ${vlasnik?.imeVlasnika}")
}
}
class Vlasnik(var imeVlasnika:String,var godine:Int)

fun ljubimac(){
    val bob=Vlasnik("Bob",23)
    val pas = Ljubimac("Rex","pas",bob)

    pas.ljubimacInfo()

    val macka=Ljubimac("Esmeralda","Macka",null)

    macka.ljubimacInfo()

}