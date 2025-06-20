import java.util.ArrayList;

public class QuiosqueApp {

    public static abstract class Item {
        private String nome;
        private double preco;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }
    }

    public static class Bebida extends Item {}
    public static class Lanche extends Item {}
    public static class Prato extends Item {}
    public static class Sobremesa extends Item {}

    public static class Pedido {
        private int id;
        private ArrayList<Item> itens = new ArrayList<>();
        private String status;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public ArrayList<Item> getItens() {
            return itens;
        }

        public void setItens(ArrayList<Item> itens) {
            this.itens = itens;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

    public static class Cliente {
        private String nome;
        private Pedido pedido;

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

    public static class Estabelecimento {
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

    public static void main(String[] args) {
        Estabelecimento est = new Estabelecimento();
        est.setNome("");

        Cliente cliente = new Cliente();
        cliente.setNome("");

        Pedido pedido = new Pedido();
        pedido.setId(1);

        Lanche lanche = new Lanche();
        lanche.setNome("");
        lanche.setPreco(0.0);

        Bebida bebida = new Bebida();
        bebida.setNome("");
        bebida.setPreco(0.0);

        pedido.getItens().add(lanche);
        pedido.getItens().add(bebida);

        cliente.setPedido(pedido);
        cliente.confirmarPedido();

        est.gerarPedidoUnico(pedido);

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Pedido #" + pedido.getId() + " - Status: " + pedido.getStatus());
        System.out.println("Itens:");
        for (Item item : pedido.getItens()) {
            System.out.println("- " + item.getNome() + " (R$ " + item.getPreco() + ")");
        }
    }
}
