import banco.Banco;
import banco.Cliente;
import banco.Conta;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Criando clientes");
        Cliente YuriALberto = new Cliente("Yuri ", " Alberto");
        System.out.println("Cliente Criado com sucesso: Yuri Alberto");
        Cliente HugoSouza = new Cliente("Hugo ", " Souza");
        System.out.println("Cliente Criado com sucesso Hugo Souza");
        Cliente Memphis = new Cliente("Memphis ", "Depay");
        System.out.println("Cliente Criado com sucesso Memphis Depay");
        Cliente Tiquinho = new Cliente("Tiquinho ", " Soares");
        System.out.println("Cliente Criado com sucesso Tiquinho Soares");
        Cliente YagoPikachu = new Cliente("Yago ", " Pikachu");
        System.out.println("Cliente Criado com sucesso Yago Pikachu");
        System.out.println("Criando contas");
        System.out.println("Contas Criadas com sucesso");
        System.out.println("Adicionando R$150.000 a conta de Yuri Alberto");
        Conta contaYuriALberto = new Conta(150_000);
        YuriALberto.setConta(contaYuriALberto);
        System.out.println("Adicionando R$200.000 a conta de Hugo Souza");
        Conta contaHugoSouza = new Conta(200_000);
        HugoSouza.setConta(contaHugoSouza);
        System.out.println("Adicionando R$150.000 a conta de Memphis Depay");
        Conta contaMemphis = new Conta(100_000);
        Memphis.setConta(contaMemphis);
        System.out.println("Adicionando R$150.000 a conta de Tiquinho Soares");
        Conta contaTiquinho = new Conta(70_000);
        Tiquinho.setConta(contaTiquinho);
        System.out.println("Adicionando R$150.000 a conta de Yago Pikachu");
        Conta contaYago = new Conta(50_000);
        YagoPikachu.setConta(contaYago);

        System.out.println("Adicionando ao banco");
        Banco banco = new Banco();
        banco.adicionarCliente(YuriALberto);
        banco.adicionarCliente(HugoSouza);
        banco.adicionarCliente(Memphis);
        banco.adicionarCliente(Tiquinho);
        banco.adicionarCliente(YagoPikachu);

        for (int i = 0; i < banco.getNumeroDeClientes(); i++) {
            Cliente cliente = banco.getCliente(i);
            Conta conta = cliente.getConta();
            System.out.println("Cliente: ["+(i+1)+"]:"+cliente.getNome()+""+cliente.getSobrenome()+"."+"Saldo "+"R$"+ cliente.getConta().getSaldo());
        }
    }
}