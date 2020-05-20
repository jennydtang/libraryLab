package Library;

public class Newspaper extends Periodical {
    private String placeofPublication;

    public Newspaper(String publisher, String genre, String author, int yearPublished, int numberofBooks,
            String placeofPublication) {
        super(publisher, genre, author, yearPublished, numberofBooks);
        this.placeofPublication = placeofPublication;

    }

    public String getPlaceofPublication() {
        return placeofPublication;
    }

    public void setPlaceofPublication(String placeofPublication) {
        this.placeofPublication = placeofPublication;
    }
}