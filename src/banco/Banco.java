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
}
