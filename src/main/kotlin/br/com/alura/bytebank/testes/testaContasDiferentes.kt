package br.com.alura.bytebank.testes

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {
    val luci = Cliente(nome="Luci",
        cpf= "222.222.222-22",
        senha=1,
        endereco = Endereco("Rua das Flores")
            )
     println("eu moro na ${luci.endereco.logradouro}")

    val contaCorrente = ContaCorrente(
        luci,
        1000
    )

    val bia = Cliente(nome="bia", cpf="", senha=2, Endereco(""))
    val contaBia = ContaCorrente(bia, 1002)


    val gui = Cliente(nome="Gui", cpf="111.111.111-11", senha=2)
    val contaPoupanca = ContaPoupanca(
        gui,
        2390
    )

    contaCorrente.deposito(1000.0)
    contaPoupanca.deposito(1000.0)

    println("conta corrente, saldo: ${contaCorrente.saldo}")
    println("conta poupança, saldo: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("conta após saque corrente, saldo: ${contaCorrente.saldo}")
    println("conta após saque poupança, saldo: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("conta corrente após transferir para poupança, saldo: ${contaCorrente.saldo}")
    println("conta poupança após receber transferência da conta corrente, saldo: ${contaPoupanca.saldo}")
}
