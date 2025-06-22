import java.util.ArrayList;

public class Client {
    private String nome;
    private Order pedido;

    public Client(String nome) {
        this.nome = nome;
        this.pedido = new Order();
    }
    
    public Client() {
        this.pedido = new Order();
    }

    public ArrayList<Item> visualizarCardapio() {
        return new ArrayList<>();
    }

    public void adicionarItemPedido(Item item) {
        if (pedido != null) {
            pedido.getItens().add(item);
        }
    }

    public void removerItemPedido(Item item) {
        if (pedido != null) {
            pedido.getItens().remove(item);
        }
    }

    public void confirmarPedido() {
        if (pedido != null) {
            pedido.setStatus("Confirmado");
        }
    }

    public String visualizarStatusPedido() {
        return pedido != null ? pedido.getStatus() : "Sem pedido";
    }

    public Order visualizarPedido() {
        return pedido;
    }

    public Order getPedido() {
        return pedido;
    }

    public void setPedido(Order pedido) {
        this.pedido = pedido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}