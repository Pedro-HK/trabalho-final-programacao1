import java.util.ArrayList;

public class Restaurant {
    private String name;
    private ArrayList<Order> activeOrders;
    private ArrayList<Item> menuItems;

    public Restaurant(String name) {
        this.name = name;
        this.activeOrders = new ArrayList<>();

        Item item1 = new Snack("X-Salada", 20.00, "Pão, carne, queijo, alface, tomate");
        Item item2 = new Snack("X-Bacon", 22.50, "Pão, carne, bacon, queijo, maionese");
        Item item3 = new Snack("X-Egg", 21.00, "Pão, carne, ovo, queijo, alface");
        Item item4 = new Snack("X-Tudo", 28.00, "Pão, carne, bacon, ovo, queijo, alface, tomate");
        Item item5 = new Snack("Cheeseburger", 18.00, "Pão, carne, queijo cheddar");
        Item item6 = new Snack("Veggie Burger", 19.50, "Pão integral, hambúrguer de soja, alface, tomate");
        Item item7 = new Snack("Frango Crispy", 23.00, "Pão, frango empanado, maionese, alface");
        Item item8 = new Snack("X-Calabresa", 24.00, "Pão, calabresa fatiada, queijo, cebola");
        Item item9 = new Snack("X-Catupiry", 25.00, "Pão, carne, catupiry, milho, ervilha");
        Item item10 = new Snack("X-Picanha", 29.00, "Pão, picanha, queijo prato, cebola caramelizada");

        Item item11 = new Drink("Coca-Cola Lata", 6.00, "Refrigerante 350ml");
        Item item12 = new Drink("Guaraná Antártica", 5.50, "Refrigerante 350ml");
        Item item13 = new Drink("Suco de Laranja", 7.00, "Suco natural de laranja");
        Item item14 = new Drink("Água Mineral", 3.00, "Garrafa 500ml sem gás");
        Item item15 = new Drink("Água com Gás", 3.50, "Garrafa 500ml com gás");
        Item item16 = new Drink("Chá Gelado", 6.50, "Chá de pêssego 500ml");
        Item item17 = new Drink("H2OH!", 6.00, "Água com gás sabor limão");
        Item item18 = new Drink("Suco de Uva", 7.00, "Suco integral 300ml");
        Item item19 = new Drink("Monster Energy", 10.00, "Bebida energética 473ml");
        Item item20 = new Drink("Café Expresso", 4.50, "Café curto e forte");

        Item item21 = new Dish("Filé à Parmegiana", 35.00, "Filé empanado com molho e queijo, arroz e batata frita");
        Item item22 = new Dish("Strogonoff de Frango", 30.00, "Frango ao molho, arroz e batata palha");
        Item item23 = new Dish("Feijoada", 32.00, "Feijão preto, carnes, arroz, farofa, couve e laranja");
        Item item24 = new Dish("Lasanha Bolonhesa", 28.00, "Massa com molho bolonhesa e queijo gratinado");
        Item item25 = new Dish("Moqueca de Peixe", 40.00, "Peixe cozido com leite de coco, arroz e pirão");
        Item item26 = new Dish("Picanha na Chapa", 45.00, "Picanha fatiada, arroz, feijão e fritas");
        Item item27 = new Dish("Salmão Grelhado", 42.00, "Salmão, arroz com brócolis e legumes");
        Item item28 = new Dish("Risoto de Camarão", 38.00, "Arroz cremoso com camarão e temperos");
        Item item29 = new Dish("Frango Grelhado", 26.00, "Peito de frango, salada e arroz integral");
        Item item30 = new Dish("Omelete Especial", 20.00, "Ovos, queijo, presunto, tomate e cebola");

        Item item31 = new Dessert("Pudim", 10.00, "Pudim de leite condensado com calda de caramelo");
        Item item32 = new Dessert("Mousse de Maracujá", 9.00, "Mousse cremosa com calda de maracujá");
        Item item33 = new Dessert("Brownie com Sorvete", 15.00, "Brownie quente com sorvete de creme");
        Item item34 = new Dessert("Torta de Limão", 11.00, "Torta gelada com cobertura de merengue");
        Item item35 = new Dessert("Petit Gâteau", 16.00, "Bolo quente com recheio de chocolate e sorvete");
        Item item36 = new Dessert("Sorvete 2 bolas", 8.00, "Escolha 2 sabores");
        Item item37 = new Dessert("Cheesecake de Morango", 14.00, "Cheesecake com calda de morango");
        Item item38 = new Dessert("Crepe de Nutella", 13.00, "Crepe recheado com Nutella e morangos");
        Item item39 = new Dessert("Açaí na Tigela", 12.00, "Açaí com banana e granola");
        Item item40 = new Dessert("Romeu e Julieta", 9.50, "Goiabada com queijo branco");

        this.menuItems = new ArrayList<>();

        menuItems.add(item1);
        menuItems.add(item2);
        menuItems.add(item3);
        menuItems.add(item4);
        menuItems.add(item5);
        menuItems.add(item6);
        menuItems.add(item7);
        menuItems.add(item8);
        menuItems.add(item9);
        menuItems.add(item10);
        menuItems.add(item11);
        menuItems.add(item12);
        menuItems.add(item13);
        menuItems.add(item14);
        menuItems.add(item15);
        menuItems.add(item16);
        menuItems.add(item17);
        menuItems.add(item18);
        menuItems.add(item19);
        menuItems.add(item20);
        menuItems.add(item21);
        menuItems.add(item22);
        menuItems.add(item23);
        menuItems.add(item24);
        menuItems.add(item25);
        menuItems.add(item26);
        menuItems.add(item27);
        menuItems.add(item28);
        menuItems.add(item29);
        menuItems.add(item30);
        menuItems.add(item31);
        menuItems.add(item32);
        menuItems.add(item33);
        menuItems.add(item34);
        menuItems.add(item35);
        menuItems.add(item36);
        menuItems.add(item37);
        menuItems.add(item38);
        menuItems.add(item39);
        menuItems.add(item40);
    }

    public void generateUniqueOrder(Order pedido) {
        pedido.setStatus("Em preparação");
        if(activeOrders.size() - 1 < 0){
            pedido.setId(0);
        } else {
            Order lastOrder = activeOrders.get(activeOrders.size() - 1);
            pedido.setId(lastOrder.getId() + 1);
        }
        storeActiveOrder(pedido);
    }

    public void storeActiveOrder(Order pedido) {
        activeOrders.add(pedido);
    }

    public void updateOrderStatus(Order pedido, String novoStatus) {
        pedido.setStatus(novoStatus);
    }

    public ArrayList<Order> getActiveOrders() {
        return activeOrders;
    }

    public void setActiveOrders(ArrayList<Order> activeOrders) {
        this.activeOrders = activeOrders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getMenuItems() {
        return menuItems;
    }

    public Item getItemByName(String name) {
        for (Item item : this.menuItems) {
            if(item.getName().equalsIgnoreCase(name)){
                return item;
            }
        }
        return null;
    }
    
    public Order getOrderById(int id) {
        for (Order pedido : this.activeOrders) {
            if(pedido.getId() == id){
                return pedido;
            }
        }
        return null;
    }

    public void setMenuItems(ArrayList<Item> menuItems) {
        this.menuItems = menuItems;
    }
}