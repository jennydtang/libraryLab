
public class GeneralBook extends Book {
    private boolean bestSeller;
    private boolean available;

    public GeneralBook(String publisher, String genre, Author author, int yearPublished, int numberofBooks,
            boolean bestSeller, boolean available, String typeName) {
        super(publisher, genre, author, yearPublished, numberofBooks, typeName);
        this.bestSeller = bestSeller;
        this.available = available;
    }

    public boolean isBestSeller() {
        return bestSeller;
    }

    public void setBestSeller(boolean bestSeller) {
        this.bestSeller = bestSeller;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}