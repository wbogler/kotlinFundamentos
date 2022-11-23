package fundamentos

fun main(){
    val x = 20

    when(x){
        5, -5, 7 -> println("x é impar")
        10 -> println("x é igual a 10")
        20 -> {
            println("O valor é 10")
            println("O valor é divisível por 10")
        }
        in 20..40 -> println("X entre 20 a 40")
        else -> println("indefinido")
    }

    comelcaComOi("oi, tudo bem")

    when{
        comelcaComOi(5) -> println("5")
        comelcaComOi("oi, tudo bem?")-> println("tudo bem")
    }
}

fun comelcaComOi(x: Any):Boolean{
    return when(x){
        is String -> x.startsWith("oi")
        else -> false
    }
}