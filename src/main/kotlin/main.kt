import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Conta
import br.com.alura.bytebank.testes.testaContasDiferentes
import novoModelo.Cliente as NovoCliente

fun main() {

    testaContasDiferentes()
    println("o total de contas é: ${Conta.total}")
}





