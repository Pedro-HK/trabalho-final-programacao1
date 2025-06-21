import java.util.ArrayList;

public class Cliente {
    private String nome;
    private Pedido pedido;

    public Cliente(String nome) {
        this.nome = nome;
        this.pedido = new Pedido();
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

    public Pedido visualizarPedido() {
        return pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}