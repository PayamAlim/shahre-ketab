package products;

public class Accessory extends Product {
    private static int counter = 0;
    private String color;

    // Setters & Getters
    public String getColor() { return color; }

    // Constructor
    public Accessory(String title, Double price, String color) {
        super(title, price);
        this.color = color;
    }

    // Methods
    @Override
    protected String generateId() {
        counter++;
        return "3" + counter;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "  Color: " + color;
    }
}