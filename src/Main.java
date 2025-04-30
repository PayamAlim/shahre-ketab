import products.*;
import inventory.Inventory;

public class Main {
    public static void main(String[] args) {
        // 1. ساخت انبارهای مختلف
        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<NoteBook> notebookInventory = new Inventory<>();
        Inventory<Accessory> accessoryInventory = new Inventory<>();

        // 2. ایجاد محصولات نمونه
        Book book1 = new Book("Java Programming", 50.0, "John Doe", "TechPub", "Educational");
        Book book2 = new Book("Design Patterns", 45.0, "Gamma", "Addison", "Computer Science");

        NoteBook notebook1 = new NoteBook("A4 Notebook", 10.0, 120, true);
        NoteBook notebook2 = new NoteBook("Pocket Notebook", 5.0, 60, false);

        Accessory accessory1 = new Accessory("Color Pencils", 5.0, "Red");
        Accessory accessory2 = new Accessory("Stapler", 7.0, "Black");

        bookInventory.addItem(book1);
        bookInventory.addItem(book2);

        notebookInventory.addItem(notebook1);
        notebookInventory.addItem(notebook2);

        accessoryInventory.addItem(accessory1);
        accessoryInventory.addItem(accessory2);

        System.out.println("----- All Books -----");
        bookInventory.displayAll();

        System.out.println("\n----- All Notebooks -----");
        notebookInventory.displayAll();

        System.out.println("\n----- All Accessories -----");
        accessoryInventory.displayAll();

        System.out.println("\n----- Inventory Operations -----");

        bookInventory.removeItemById(book1.getId());
        System.out.println("\nAfter removing book with ID " + book1.getId() + ":");
        bookInventory.displayAll();

        System.out.println("\nSearching for notebook with ID " + notebook2.getId() + ":");
        NoteBook foundNotebook = notebookInventory.findItemById(notebook2.getId());
        if(foundNotebook != null) {
            System.out.println("Found: " + foundNotebook);
        }

        accessoryInventory.applyDiscount("Color Pencils", 20); // 20% discount
        System.out.println("\nAfter applying 20% discount to 'Color Pencils':");
        accessoryInventory.displayAll();

        System.out.println("\n----- Total Prices -----");
        System.out.println("Total books price: " + calculateTotalPrice(bookInventory));
        System.out.println("Total notebooks price: " + calculateTotalPrice(notebookInventory));
        System.out.println("Total accessories price: " + calculateTotalPrice(accessoryInventory));
    }

    public static double calculateTotalPrice(Inventory<? extends Product> inventory) {
        double total = 0;
        for(Product item : inventory.getItems()) {
            total += item.getPrice();
        }
        return total;
    }
}