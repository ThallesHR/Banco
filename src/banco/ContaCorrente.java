package banco;

public class ContaCorrente extends Conta {
    private double chequeEspecial;

    public ContaCorrente(double SaldoInicial,double chequeEspecial) {
    super(SaldoInicial);
    this.chequeEspecial = chequeEspecial;
    }
    public ContaCorrente(double SaldoInicial) {
    this(SaldoInicial,0.0);
    }
    public boolean sacar(double valor) {
        if (valor > this.saldo + this.chequeEspecial) {
            return false;
        }
        if (valor <= this.saldo) {
            this.saldo -= valor;
        }
        return true;
    }
}
