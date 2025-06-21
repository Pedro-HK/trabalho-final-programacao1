import java.util.ArrayList;

public class Pedido {
    private int id;
    private ArrayList<Item> itens;
    private String status;
    private double fullPrice;

    public Pedido() {
        this.itens = new ArrayList<>();
        this.status = "Pendente";
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