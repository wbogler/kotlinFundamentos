package fundamentos

class Carro (var cor:String, var anoFabricacao: Int, var dono: Dono){
}

data class Dono(var nome: String, var idade: Int){
}

fun main(){
//    var carro = Carro("branco", 2018)
//    println(carro.cor)
//    carro.cor = "preto"
//    println(carro.cor)

    var carro2 = Carro("Cinza", 2020, Dono("Willian", 30))
    println(carro2.dono)
}