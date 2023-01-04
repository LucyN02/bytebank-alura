package br.com.alura.bytebank.testes

import br.com.alura.bytebank.modelo.Analista
import br.com.alura.bytebank.modelo.CalculadoraBonificacao
import br.com.alura.bytebank.modelo.Diretor

fun testaFuncionarios() {
    val alex = Analista(
        "Alex",
        "111.111.111-11",
        1000.0,
        100.0
    )
    println("nome: ${alex.nome}")
    println("cpf: ${alex.cpf}")
    println("salario: ${alex.salario}")
    println("bonificacao: ${alex.bonificacao()}")

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000
    )

    println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")
    println("Nome: ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificação: ${gui.bonificacao()}")


    val maria = Analista(
        "Maria",
        "3289876437",
        3000.0,
        100.0
    )

    println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("total de bonificação: ${calculadora.total}")
//    if(fran.autentica(4000)){
//        println("autenticou com sucesso")
//    } else {
//        println("falha na autentição")
//    }
}