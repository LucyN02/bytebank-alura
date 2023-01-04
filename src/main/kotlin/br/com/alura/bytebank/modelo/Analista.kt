package br.com.alura.bytebank.modelo

class Analista (nome: String,
                cpf: String,
                salario: Double,
                val plr: Double) :
    Funcionario(nome, cpf, salario) {

//    override val bonificacao: Double
//        get() {
//            return salario * 0.2 + salario
//        }

override fun bonificacao(): Double {
    println("bonificação analista")
    return salario * 0.2

        }
    }