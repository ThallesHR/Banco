package banco;

public class ContaPoupanca extends Conta {
    private double TaxaRendimento;

    public ContaPoupanca(double saldoInicial,double taxaRendimento) {
        super(saldoInicial);
    }
    public double getTaxaRendimento() {
        return TaxaRendimento;
    }
    public void setTaxaRendimento(double taxaRendimento) {
        TaxaRendimento = taxaRendimento;
    }
    @Override
    public boolean sacar(double valor) {
        double SaldoTotal = getSaldo();
        if (valor > this.saldo + this.saldo) {
            return false;
        }
        if (valor <= this.saldo) {
            this.saldo -= valor;
        }
        return true;
    }
}
