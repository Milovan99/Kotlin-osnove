package poglavlje_3

class BankovniNalog(private val nalogId:Int,private var stanje:Double){
    fun podigniNovac(podigni:Double){
        if(podigni>stanje){
            println("Nemate dovoljno sredstava na racunu")
        }else{
            stanje-=podigni
            println("Uspesno ste podigli ${podigni} na vasem racunu je ostalo ${stanje}")
        }
    }
    fun uplati(uplata:Double){
        if(uplata>0){
            stanje+=uplata
            println("Uspesno ste uplatili ${uplata},stanje na vasem racunu je ${stanje}")
        }
    }
}
fun banka(){
    val racun=BankovniNalog(232,500.0)
    racun.podigniNovac(600.0)
    racun.uplati(100.0)
    racun.podigniNovac(600.0)
}