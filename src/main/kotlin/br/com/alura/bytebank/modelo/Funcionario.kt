package br.com.alura.bytebank.modelo

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double) {
    //abstract é um modelo genérico que não é utilizado diretamente em uma instância, mas que serve para ser implementado por outras classes
    //abstract não pode ter implementação
    //funções abstratas so podem ser feitas em classes que sejam abstratas
    //em  novas classes que estejam utilizando a classe abstrata, é necessário implementar todos os membros abstratos da classe abstrata,
    // caso esses membros estejam declarados como abstratas
    //classes abstratas servem como referência/base para as outras classes, na qual possuem comportamentos comuns
    //classes abstratas não permitem criar objetos/instâncias da classe
    //membros abstratos so podem ser declarados por classes abstratas
    //caso alguma classe abstrata herde de outra classe abstrata, não vai ser necessário/obrigatório implementar os membros abstratos da classe mãe


    //open val bonificacao: Double get()=salario * 0.1
    abstract fun bonificacao(): Double

//    fun autentica(senha: Int){
//        if(tipo == 1){
//            //pode autenticar
//        }
//    }
}

