package fundamentos


fun main(){
    var nome = retornaNome()
    println(nome)

    var nome2 = sayHello("Willian")

    sayHello(retornaNome())
}

fun retornaNome(): String{
    return "Willian"
}

fun sayHello(nome:String){
    println("Oi, ${nome}")
}