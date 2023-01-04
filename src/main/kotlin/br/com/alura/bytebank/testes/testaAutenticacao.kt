package br.com.alura.bytebank.testes

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        "Luciana",
        "714.187.454-21",
        2500.0,
        12345
    )
    val diretor = Diretor(
        "Fe",
        "524,236,256-54",
        3500.0,
        159874
    )

    val cliente = Cliente(
        "Gui",
        "245.555.555-55",
        123456
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 12345)
    sistema.entra(diretor, 159874)
    sistema.entra(cliente, 123456)
}
