import java.util.ArrayList;

public class Estabelecimento {
    private String nome;
    private ArrayList<Pedido> pedidosAtivos = new ArrayList<>();

    public void gerarPedidoUnico(Pedido pedido) {
        pedido.setStatus("Em preparação");
        armazenarPedidoAtivo(pedido);
    }

    public void armazenarPedidoAtivo(Pedido pedido) {
        pedidosAtivos.add(pedido);
    }

    public void atualizarStatusPedido(Pedido pedido, String novoStatus) {
        pedido.setStatus(novoStatus);
    }

    public ArrayList<Pedido> getPedidosAtivos() {
        return pedidosAtivos;
    }

    public void setPedidosAtivos(ArrayList<Pedido> pedidosAtivos) {
        this.pedidosAtivos = pedidosAtivos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}