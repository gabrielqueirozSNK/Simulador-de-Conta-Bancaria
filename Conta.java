public class Conta {
    String cliente;
    String numeroDaConta;
    double saldo;

    void depositar(double valor) {
        this.saldo = this.saldo + valor;
        System.out.println("Depositado r$" + valor + " na conta de " + this.cliente);
    }
    void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            System.out.println("Sacado r$" + valor + " da conta de " + this.cliente);
        } else {
            System.out.println("Saldo insuficiente para saque de r$" + valor + " na conta de " + this.cliente);
        }
    }
    void informaçoes() {
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Número da Conta: " + this.numeroDaConta);
        System.out.println("Saldo: r$" + this.saldo);
    }



    
}
