package br.com.alura.bytebank.modelo

class Auxiliar (nome: String,
                cpf: String,
                salario: Double,
                val plr: Double) :
    Funcionario(nome, cpf, salario) {

    override fun bonificacao(): Double {
        return salario * 0.05
    }

}