package inventory;

import products.Product;
import java.util.ArrayList;

public class Inventory<T extends Product> {
    private ArrayList<T> items = new ArrayList<>();

    public void addItem(T product) {
        items.add(product);
    }

    public void removeItemById(String id) {
        items.removeIf(item -> item.getId().equals(id));
    }

    public T findItemById(String id) {
        for (T item : items)
            if (item.getId().equals(id))
                return item;
        System.err.println("Item with ID: " + id + " not found!");
        return null;
    }

    public void displayAll() {
        for (T item : items) {
            System.out.println(item.toString());
        }
    }

    public void applyDiscount (String productName, int discount) {
        T product = null;
        for (T item : items)
            if (item.getTitle().equals(productName))
                product = item;
        if (product == null)
            throw new IllegalArgumentException("Product with title: " + productName + " not found");

        product.setPrice(product.getPrice() * (1 - (double)discount / 100));
    }
}