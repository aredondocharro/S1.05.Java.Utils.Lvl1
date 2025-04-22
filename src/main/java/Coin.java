import java.io.Serializable;

public class Coin implements Serializable {
    private String name;
    private Double quantity;

    public Coin(String name, Double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Coin[" +
                "Name = '" + name + '\'' +
                ", Quantity = " + quantity +
                ']';
    }
}
