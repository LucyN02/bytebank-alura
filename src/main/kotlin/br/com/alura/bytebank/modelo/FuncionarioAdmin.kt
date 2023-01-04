package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Funcionario

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
    ): Funcionario(
    nome,
    cpf,
    salario
) {

    //open val bonificacao: Double get()=salario * 0.1

    fun autentica(senha: Int): Boolean {
        println("Autentica funcionario admin")
        if(this.senha == senha){
            return true
        }
        return false
    }
}

