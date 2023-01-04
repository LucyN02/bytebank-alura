package br.com.alura.bytebank.testes

fun testaCondicoes(saldo: Double) {
    // if(saldo > 0.0){
//                  println("Saldo é positivo")
//              }else if(saldo == 0.0){
//                  println("O seu saldo é 0.0")
//              }else {
//                  print("O seu saldo é negativo")
//              }
    when {
        saldo > 0.0 -> println("Saldo é positivo")
        saldo == 0.0 -> println("O seu saldo é neutro")
        else -> {
            println("O seu saldo é negativo")
        }
    }
}
