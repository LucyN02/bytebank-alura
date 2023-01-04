package br.com.alura.bytebank.modelo

interface Autenticavel {

    fun autentica(senha: Int): Boolean

}

//Interface vai ter a ideia de abstrato com métodos abstratos
//Interface não guarda estado, ou seja, armazenar valores ex: valor de uma propriedade
//não tem construtores
//ela vai determinar um comportamento
//Podemos pensar como se a interface fosse um contrato, na qual qualquer um que estiver implementando ela
//vai garantir os comportamentos exigidos da interface
//se houver informações sensiveis, não optar pela interface, exemplo: senhas
//posso declarar properties
//posso escolher qual implementação de método utilizar, caso exista o mesmo comportamento em uma classe mãe.
//utilizamos a interface para usar o polimorfismo em classes que tem o mesmo comportamento, mas não herdam da mesma classe.