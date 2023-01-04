package br.com.alura.bytebank.testes

fun testaLacos() {
    //              for (i in 1..5) { //for (i in 5 downTo 1) OU for (i in 5 downTo 1 step 2)
//                  if (i == 4) {
//                      continue //ou podemos usar o break
//                  }
//                  val titular = "Alex $i"
//                  val numeroConta = 1000 + i
//                  var saldo = i + 10.0
//
//                  println("O seu titular é $titular")
//                  println("Numero da conta é $numeroConta")
//                  println("O seu saldo é $saldo")
//                  println()
//              }
    var i = 0
    while (i < 5) {
        val titular = "Alex $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("O seu titular é $titular")
        println("Numero da conta é $numeroConta")
        println("O seu saldo é $saldo")
        testaCondicoes(saldo)
        println()
        i++
    }

}
