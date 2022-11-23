package fundamentos

fun main(){
    for(i in 1..10){ //1..10 range
        println(i)
    }

    for (i in 10 downTo 1){
        println(i)
    }

    for (i in 1..20 step 2){
        println(i)
    }

    printRange(10,20)

    var x = 0
    while (x < 10){
        print("Will ")
        x++
    }

    var teste = 0
    do {
        println(teste)
        teste++
    }while(teste < 10)
}

fun printRange(inicio: Int, fim:Int){
    for( i in inicio..fim){
        println(i)
    }
}