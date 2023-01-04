package br.com.alura.bytebank.modelo

class CalculadoraBonificacao {
    var total: Double =0.0
//para comportamentos genéricos podemos usar uma função para todos
    fun registra(funcionario: Funcionario){
        this.total += funcionario.bonificacao()
    }
//    fun registra(gerente: modelo.Gerente){
//        this.total += gerente.bonificacao()
//    }
//    fun registra(diretor: modelo.Diretor){
//        this.total += diretor.bonificacao()
//    }

}