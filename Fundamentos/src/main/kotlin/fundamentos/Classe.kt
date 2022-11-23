package fundamentos

class Pessoa(var nome:String, var idade:Int){
    override fun toString(): String {
        return "Classe: Pessoa. Nome: ${nome}, idade: ${idade}"
    }
}

class Classe {
}

fun main(){
    var willian = Pessoa("Willian", 30)

    println(willian)
}