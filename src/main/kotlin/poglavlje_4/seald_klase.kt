package poglavlje_4

sealed class A(val number: Int){
    class B(n:Int):A(n){
        fun prikazi(){
            println("broj = ${number}")
        }
    }
    class C(n:Int):A(n){
        fun kvadrat(){
            println("Kvadrat = "+number*number)
        }
    }
}
class D(n: Int):A(n){
    fun kub(){
        println("Kub =" + number*number*number)
    }
}

fun status(a:A){
    when(a){
        is A.B->a.prikazi()
        is A.C->a.kvadrat()
        is D->a.kub()
    }
}

fun seald(){
    var b = A.B(1)
    b.prikazi()
    var c=A.C(2)
    var d=D(3)

    status(d)
}