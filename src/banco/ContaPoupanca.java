package banco;

public class ContaPoupanca extends Conta {
    private double TaxaRendimento;

    public ContaPoupanca(double saldoInicial,double taxaRendimento) {
        super(saldoInicial);
    }
}
