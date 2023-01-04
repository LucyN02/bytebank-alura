package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Autenticavel

class Cliente(
    var nome: String,
    val cpf: String,
    private val senha: Int,
    val endereco: Endereco = Endereco()
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        println("Autentica funcionario admin")
        if(this.senha == senha){
            return true
        }
        return false
        }
    }
