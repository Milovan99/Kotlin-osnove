package poglavlje_4

class Person {
    var name:String=""
        get()=field

        set(value) {
            if (value.isNotEmpty())
                field=value
        }
    var age:Int=1
        get()=field
        set(update){
            if (update>0)
                field=update
        }
}
fun propertis(){
    val milovan = Person()
    milovan.name="Milovan Jakovljevic"
    milovan.age=23

    println(milovan.name)
    println(milovan.age)

    milovan.name=""
    milovan.age=0
    println(milovan.name)
    println(milovan.age)
}