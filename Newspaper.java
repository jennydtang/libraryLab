
public class Newspaper extends Periodical {
    private String placeofPublication;

    public Newspaper(String publisher, String genre, Author author, int yearPublished, int numberofBooks,
            String placeofPublication, String typeName) {
        super(publisher, genre, author, yearPublished, numberofBooks, typeName);
        this.placeofPublication = placeofPublication;

    }

    public String getPlaceofPublication() {
        return placeofPublication;
    }

    public void setPlaceofPublication(String placeofPublication) {
        this.placeofPublication = placeofPublication;
    }
}