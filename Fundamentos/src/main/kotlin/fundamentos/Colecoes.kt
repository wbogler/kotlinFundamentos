package fundamentos



fun main(){
    var lista = listOf<Int>(1,2,3) // lista imutavel

    var pares = lista.filter { it % 2 ==0 }
    println(pares)

    var primeiroPar = lista.filter { it % 2 ==0 }.first()
    lista.forEach(){ //laço de repetição similar ao for (também é possível usar o for)
        println(it)
    }
    println(lista[0]) //podemos usar o lista.get(0) -> mesmo resultado
    //outros pontos de listas .size; .indexOf entre outros

    var lista2 = mutableListOf(1,2,3,4,5,6) //lista mutável

    var setNumero = setOf(1,2) //não aceita valores duplicados

    var mapIdades = mapOf("Willian" to 30, "Ana" to 38) //chave e valor
    //não pode existir chaves duplicadas, mas valores sim.



}