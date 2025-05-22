package banco;

public class ContaCorrente extends Conta {
    private double chequeEspecial;
    private ContaPoupanca contaPoupanca;

    public ContaCorrente(double saldoInicial, double chequeEspecial) {
        super(saldoInicial);
        this.chequeEspecial = chequeEspecial;
    }

    public ContaCorrente(double saldoInicial) {
        this(saldoInicial, 0.0);
    }

    public void setContaPoupanca(ContaPoupanca contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }

    public ContaPoupanca getContaPoupanca() {
        return contaPoupanca;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else if (valor <= this.saldo + this.chequeEspecial) {
            double diferenca = valor - this.saldo;
            if (contaPoupanca != null && contaPoupanca.getSaldo() >= diferenca) {
                boolean saquePoupanca = contaPoupanca.sacar(diferenca);
                if (saquePoupanca) {
                    this.saldo = 0.0;
                    return true;
                }
            }
        }
        return false;
    }
}
