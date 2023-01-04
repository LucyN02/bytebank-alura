package br.com.alura.bytebank.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int) :
    FuncionarioAdmin(
        nome,
        cpf,
        salario,
        senha), Autenticavel {

//    override val bonificacao: Double
//        get() {
//            return salario * 0.3 + salario + plr
//        }

    override fun bonificacao(): Double {
        println("bonificação diretor")
        return salario * 0.4
    }

}