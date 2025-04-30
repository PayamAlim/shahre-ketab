package products;

public class Book extends Product {
    private static Integer counter = 0;
    private String author;
    private String publication;
    private String genre;

    public Book(String title, Double price, String author, String publication, String genre) {
        super(title, price);
        this.author = author;
        this.publication = publication;
        this.genre = genre;
    }

    @Override
    protected String generateId() {
        counter ++;
        return "1" + counter;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "  Author: " + author + "\n" +
                "  Publication: " + publication + "\n" +
                "  Genre: " + genre;
    }
}