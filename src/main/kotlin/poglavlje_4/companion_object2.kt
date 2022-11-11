package poglavlje_4

data class Zaposleni(val ime:String,val id:Int)

interface ZaposlenikInterface{
    fun kreiraj(ime: String,id: Int):Zaposleni
}

class ZaposlenikFactory{
    companion object : ZaposlenikInterface{
        override fun kreiraj(ime: String, id: Int): Zaposleni {
            return Zaposleni(ime,id)
        }
    }
}

fun companion2(){
    val zaposlenik1 = ZaposlenikFactory.kreiraj("Milovan",345)
    val zaposlenik2 = ZaposlenikFactory.kreiraj("Djole",896)

    println(zaposlenik1)
    println(zaposlenik2)

    val proizvod1=FabrikaProizvoda.kreirajProizvod("Stolica",50)
    println(proizvod1)
}

data class Proizvod(val ime:String,val cena:Int)

interface ProizvodInterface{
    fun kreirajProizvod(ime:String,cena:Int):Proizvod
}

class FabrikaProizvoda{
    companion object :ProizvodInterface{
        override fun kreirajProizvod(ime: String, cena: Int): Proizvod {
            return Proizvod(ime,cena)
        }
    }
}