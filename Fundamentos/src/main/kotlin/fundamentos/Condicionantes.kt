package fundamentos

fun main(){
    println(parOuImpar(5))

}

fun parOuImpar(numero: Int):String{
    var numero = numero;

    if(numero % 2 == 0){
        return ("Par")
    }else{
        return("Impar")
    }

    //para if encadeado basta colocar else if(){}
}