package fundamentos

fun main(){
    var nome = "Willian" //mutavel
    val nome2 = "Bogler" //imutavel

    //dar sempre preferencia às val's

}

class variaceis{
    lateinit var teste:String //lateinit é para iniciar a variável sem declarar ela no escopo main.
    //criamos uma variável fora do main, mas que será invocado a posterior

    fun iniciaVal(){
        teste = "Teste"
    }
}