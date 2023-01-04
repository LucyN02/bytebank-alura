package br.com.alura.bytebank.modelo

abstract class Conta(var titular: Cliente, val numero: Int) {
    var saldo = 0.0
        protected set
        //o get e o set já vem encapulado em cada propriedade, de forma ímplicita, aqui colocamos p entender melhor
        //e para o set estabelecemos uma nova regra de negócio, mudamos a forma que ele estava sendo usado
        //private set
        //        set(valor){
//                field = valor
//            }
        get() {
            return field
        }

    fun deposito(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }
    companion object{
        var total = 0
            private set
        //atribuimos para privado para que não seja modificado por nenhuma outra classe
    }
    init{
        total++
    }
    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            saldo -= valor
            destino.deposito(valor)
            return true
        }
        return false
    }
}