import banco.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Seu Sistema Bancário");
        System.out.println("...Iniciando Sistema de CLientes...");
        System.out.println("Criando Cliente Yuri Alberto");
        Cliente YuriAlberto = new Cliente("Yuri", "Alberto");
        System.out.println("Criando Cliente Memphis Depay");
        Cliente MemphisDepay = new Cliente("Memphis", "Depay");
        System.out.println("Criando Cliente Hugo Souza");
        Cliente HugoSouza = new Cliente("Hugo", "Souza");
        System.out.println("Criando Cliente Juanito Silva");
        Cliente juanitoSilva = new Cliente("Juanito", "Silva");
        System.out.println("Criando Cliente Bruno Henrique");
        Cliente brunoHenrique = new Cliente("Bruno", "Henrique");
        System.out.println("----Criando Contas Bancárias");
        System.out.println("Criando uma conta corrente ao cliente Yuri Alberto");
        Conta ContaYuriAlberto = new ContaCorrente(50.000,10.000);
        YuriAlberto.setConta(ContaYuriAlberto);
        System.out.println("Criando uma conta poupança ao cliente Memphis Depay");
        Conta ContaMemphisDepay = new ContaPoupanca(150.000,1.0);
        MemphisDepay.setConta(ContaMemphisDepay);
        System.out.println("Criando uma conta corrente ao cliente Hugo Souza");
        Conta ContaHugoSouza = new ContaCorrente(70.000,10.000);
        HugoSouza.setConta(ContaHugoSouza);
        System.out.println("Criando uma conta corrente ao cliente Juanito Silva");
        Conta ContaJuanitoSilva = new ContaCorrente(10.000,1.0);
        juanitoSilva.setConta(ContaJuanitoSilva);
        System.out.println("Criando uma conta corrente ao cliente Bruno Henrique");
        Conta ContaBrunoHenrique = new ContaCorrente(150.000,1.0);
        brunoHenrique.setConta(ContaBrunoHenrique);





        System.out.println("Adicionando ao banco");
        Banco banco = new Banco();
        banco.adicionarCliente(YuriAlberto);
        banco.adicionarCliente(MemphisDepay);
        banco.adicionarCliente(HugoSouza);
        banco.adicionarCliente(juanitoSilva);
        banco.adicionarCliente(brunoHenrique);


        System.out.println("--------TRANSAÇÕES-------");
        System.out.println("Sacando R$:10,000 do cliente Bruno Henrique");
        ContaBrunoHenrique.sacar(10.000);
        System.out.println("Depositando R$:5,000 ao cliente Yuri Alberto");
        ContaYuriAlberto.depositar(5.000);
        System.out.println("Depositando R$:10,000 ao cliente Memphis Depay");
        ContaMemphisDepay.depositar(10.000);
        System.out.println("Sacando R$:40,000 ao cliente Hugo Souza");
        ContaHugoSouza.sacar(40.000);
        System.out.println("Segue abaixo o Saldo de Todos os Clientes");
        ///for (int i = 0; i < banco.getNumeroDeClientes(); i++) {
        /// Cliente cliente = banco.getCliente(i);
        ///Conta conta = cliente.getConta();
        ///String temp = "Cliente [" + (i + 1) + "] : " +
        ///cliente.getNome() + " " +
        ///cliente.getSobrenome() + "." +
        /// " Saldo R$:" + conta.getSaldo();
        ///System.out.println(temp);

        ///}

        }
    }
