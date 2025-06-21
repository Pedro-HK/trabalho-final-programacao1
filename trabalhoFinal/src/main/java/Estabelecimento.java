import java.util.ArrayList;

public class Estabelecimento {
    private String nome;
    private ArrayList<Pedido> pedidosAtivos;
    private ArrayList<Item> itemsCardapio;

    public Estabelecimento(String nome) {
        this.nome = nome;
        this.pedidosAtivos = new ArrayList<>();

        Item item1 = new Lanche("X-Salada", 20.00, "Pão, carne, queijo, alface, tomate");
        Item item2 = new Lanche("X-Bacon", 22.50, "Pão, carne, bacon, queijo, maionese");
        Item item3 = new Lanche("X-Egg", 21.00, "Pão, carne, ovo, queijo, alface");
        Item item4 = new Lanche("X-Tudo", 28.00, "Pão, carne, bacon, ovo, queijo, alface, tomate");
        Item item5 = new Lanche("Cheeseburger", 18.00, "Pão, carne, queijo cheddar");
        Item item6 = new Lanche("Veggie Burger", 19.50, "Pão integral, hambúrguer de soja, alface, tomate");
        Item item7 = new Lanche("Frango Crispy", 23.00, "Pão, frango empanado, maionese, alface");
        Item item8 = new Lanche("X-Calabresa", 24.00, "Pão, calabresa fatiada, queijo, cebola");
        Item item9 = new Lanche("X-Catupiry", 25.00, "Pão, carne, catupiry, milho, ervilha");
        Item item10 = new Lanche("X-Picanha", 29.00, "Pão, picanha, queijo prato, cebola caramelizada");

        Item item11 = new Bebida("Coca-Cola Lata", 6.00, "Refrigerante 350ml");
        Item item12 = new Bebida("Guaraná Antártica", 5.50, "Refrigerante 350ml");
        Item item13 = new Bebida("Suco de Laranja", 7.00, "Suco natural de laranja");
        Item item14 = new Bebida("Água Mineral", 3.00, "Garrafa 500ml sem gás");
        Item item15 = new Bebida("Água com Gás", 3.50, "Garrafa 500ml com gás");
        Item item16 = new Bebida("Chá Gelado", 6.50, "Chá de pêssego 500ml");
        Item item17 = new Bebida("H2OH!", 6.00, "Água com gás sabor limão");
        Item item18 = new Bebida("Suco de Uva", 7.00, "Suco integral 300ml");
        Item item19 = new Bebida("Monster Energy", 10.00, "Bebida energética 473ml");
        Item item20 = new Bebida("Café Expresso", 4.50, "Café curto e forte");

        Item item21 = new Prato("Filé à Parmegiana", 35.00, "Filé empanado com molho e queijo, arroz e batata frita");
        Item item22 = new Prato("Strogonoff de Frango", 30.00, "Frango ao molho, arroz e batata palha");
        Item item23 = new Prato("Feijoada", 32.00, "Feijão preto, carnes, arroz, farofa, couve e laranja");
        Item item24 = new Prato("Lasanha Bolonhesa", 28.00, "Massa com molho bolonhesa e queijo gratinado");
        Item item25 = new Prato("Moqueca de Peixe", 40.00, "Peixe cozido com leite de coco, arroz e pirão");
        Item item26 = new Prato("Picanha na Chapa", 45.00, "Picanha fatiada, arroz, feijão e fritas");
        Item item27 = new Prato("Salmão Grelhado", 42.00, "Salmão, arroz com brócolis e legumes");
        Item item28 = new Prato("Risoto de Camarão", 38.00, "Arroz cremoso com camarão e temperos");
        Item item29 = new Prato("Frango Grelhado", 26.00, "Peito de frango, salada e arroz integral");
        Item item30 = new Prato("Omelete Especial", 20.00, "Ovos, queijo, presunto, tomate e cebola");

        Item item31 = new Sobremesa("Pudim", 10.00, "Pudim de leite condensado com calda de caramelo");
        Item item32 = new Sobremesa("Mousse de Maracujá", 9.00, "Mousse cremosa com calda de maracujá");
        Item item33 = new Sobremesa("Brownie com Sorvete", 15.00, "Brownie quente com sorvete de creme");
        Item item34 = new Sobremesa("Torta de Limão", 11.00, "Torta gelada com cobertura de merengue");
        Item item35 = new Sobremesa("Petit Gâteau", 16.00, "Bolo quente com recheio de chocolate e sorvete");
        Item item36 = new Sobremesa("Sorvete 2 bolas", 8.00, "Escolha 2 sabores");
        Item item37 = new Sobremesa("Cheesecake de Morango", 14.00, "Cheesecake com calda de morango");
        Item item38 = new Sobremesa("Crepe de Nutella", 13.00, "Crepe recheado com Nutella e morangos");
        Item item39 = new Sobremesa("Açaí na Tigela", 12.00, "Açaí com banana e granola");
        Item item40 = new Sobremesa("Romeu e Julieta", 9.50, "Goiabada com queijo branco");

        this.itemsCardapio = new ArrayList<>();

        itemsCardapio.add(item1);
        itemsCardapio.add(item2);
        itemsCardapio.add(item3);
        itemsCardapio.add(item4);
        itemsCardapio.add(item5);
        itemsCardapio.add(item6);
        itemsCardapio.add(item7);
        itemsCardapio.add(item8);
        itemsCardapio.add(item9);
        itemsCardapio.add(item10);
        itemsCardapio.add(item11);
        itemsCardapio.add(item12);
        itemsCardapio.add(item13);
        itemsCardapio.add(item14);
        itemsCardapio.add(item15);
        itemsCardapio.add(item16);
        itemsCardapio.add(item17);
        itemsCardapio.add(item18);
        itemsCardapio.add(item19);
        itemsCardapio.add(item20);
        itemsCardapio.add(item21);
        itemsCardapio.add(item22);
        itemsCardapio.add(item23);
        itemsCardapio.add(item24);
        itemsCardapio.add(item25);
        itemsCardapio.add(item26);
        itemsCardapio.add(item27);
        itemsCardapio.add(item28);
        itemsCardapio.add(item29);
        itemsCardapio.add(item30);
        itemsCardapio.add(item31);
        itemsCardapio.add(item32);
        itemsCardapio.add(item33);
        itemsCardapio.add(item34);
        itemsCardapio.add(item35);
        itemsCardapio.add(item36);
        itemsCardapio.add(item37);
        itemsCardapio.add(item38);
        itemsCardapio.add(item39);
        itemsCardapio.add(item40);
    }

    public void gerarPedidoUnico(Pedido pedido) {
        pedido.setStatus("Em preparação");
        Pedido lastOrder = pedidosAtivos.get(pedidosAtivos.size() - 1);
        if(lastOrder == null){
            pedido.setId(0);
        } else {
            pedido.setId(lastOrder.getId() + 1);
        }
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

    public ArrayList<Item> getItemsCardapio() {
        return itemsCardapio;
    }

    public Item getItemByName(String name) {
        for (Item item : this.itemsCardapio) {
            if(item.getNome().equalsIgnoreCase(name)){
                return item;
            }
        }
        return null;
    }

    public void setItemsCardapio(ArrayList<Item> itemsCardapio) {
        this.itemsCardapio = itemsCardapio;
    }
}