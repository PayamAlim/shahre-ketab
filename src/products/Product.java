package products;

public abstract class Product {
    private String title;
    private Double price;
    private String id;

    // Setters & Getters
    public String getTitle() { return title; }
    public Double getPrice() { return price; }
    public String getId() { return id; }

    // Constructor
    public Product(String title, Double price) {
        this.title = title;
        this.price = price;
        this.id = generateId();
    }

    // Methods
    protected abstract String generateId();

    @Override
    public String toString() {
        return "* ID: " + id + "\n" +
                "  Title: " + title + "\n" +
                "  Price: " + price;
    }
}
