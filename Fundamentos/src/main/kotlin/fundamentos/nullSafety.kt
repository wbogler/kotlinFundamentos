package fundamentos

fun main(){
    var nome = "Willian"

    // nome = null -> isso retorna um null

    var nome2: String?  = "Willian"  //pode ser nulo
//    nome2 = null -> não dá erro

    // println(nome2.length) -> não permite, pois existe a possibilidade de retornar null

    println(nome?.length) //agora informando que pode ser nulo ele aceita e evita erros.

    val toShort : Short = nome2!!.length.toShort() // uso do !! significa garantia que isso nunca será null (risco porparte do programador

    //elvis operator ?:
    var nome3 : String? = "Willian"
    var tamanho: Int = nome3?.length ?: 0 //note que é quae um operador ternnário (se a string não for válida retorna 0)

}