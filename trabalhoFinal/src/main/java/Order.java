import java.util.ArrayList;

public class Order {
    private int id;
    private ArrayList<Item> itens;
    private String status;
    private double fullPrice;

    public Order() {
        this.itens = new ArrayList<>();
        this.status = "Pendente";
    }
    
    public void addItem(Item item) {
        this.itens.add(item);
    }
    
    public void removeItem(Item item) {
        this.itens.remove(item);
    }

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

    public double getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(double fullPrice) {
        this.fullPrice = fullPrice;
    }
}