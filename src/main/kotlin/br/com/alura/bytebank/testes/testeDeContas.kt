package br.com.alura.bytebank.testes

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testeDeContas() {
    val alex = Cliente(nome="Alex", cpf="333.333.333-22", senha=3)
    val contaAlex = ContaCorrente(titular = alex, numero = 1001) //label

    val fran = Cliente(nome="Fran", cpf="444.444.444-22", senha=4)
    val contaFran = ContaPoupanca(fran, 1002)

    contaAlex.deposito(200.0)

    contaFran.deposito(300.0)

//              println(contaAlex.titular)
//              println(contaAlex.numero)
//              println(contaAlex.saldo)
//
//              println(contaFran.titular)
//              println(contaFran.numero)

    contaFran.deposito(70.0)
    println(contaFran.saldo)
    contaFran.saca(380.0)
    println(contaFran.saldo)

    if (contaFran.transfere(90.0, contaAlex)) {
        println("transação sucedida")
    } else {
        println("falha na transação")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}
