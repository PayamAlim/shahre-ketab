package products;

public class NoteBook extends Product {
    private static int counter = 0;
    private int pageCount;
    private boolean isHardCover;

    // Setters & Getters
    public int getPageCount() { return pageCount; }
    public boolean isHardCover() { return isHardCover; }

    // Constructor
    public NoteBook(String title, Double price, int pageCount, boolean isHardCover) {
        super(title, price);
        this.pageCount = pageCount;
        this.isHardCover = isHardCover;
    }

    // Methods
    @Override
    protected String generateId() {
        counter ++;
        return "2" + counter;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "  Page Count: " + pageCount + "\n" +
                "  Hard Cover: " + (isHardCover ? "Yes" : "No");
    }
}