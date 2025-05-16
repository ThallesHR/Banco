package banco;
import java.util.ArrayList;

public class Banco {

    private ArrayList<Cliente> clientes;
    private int numeroClientes;

    public Banco() {
         clientes = new ArrayList<>(5);
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);

    }

    public Cliente getCliente(int indice) {
        return clientes.get(indice);
    }

    public int getNumeroDeClientes() {
        return this.clientes.size();
    }
    public ArrayList<Cliente> getClientes(String nome,String sobrenome) {
        ArrayList<Cliente> resultado = new ArrayList<>();
        for (Cliente cliente : clientes) {
        if (cliente.getNome().equalsIgnoreCase(nome) && cliente.getSobrenome().equalsIgnoreCase(sobrenome)) {
            resultado.add(cliente);
        }
        }
        return resultado;
    }
    }