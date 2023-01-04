package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.FuncionarioAdmin

class Gerente (
    nome: String,
    cpf: String, salario: Double,
    senha: Int) :
    FuncionarioAdmin(
        nome,
        cpf,
        salario,
        senha), Autenticavel {

//    override val bonificacao: Double
//        get() {
//            return salario * 0.2 + salario
//        }

override fun bonificacao(): Double {
    println("bonificação gerente")
    return salario * 0.3
}
        }