
public class LibraryItem {
    private String publisher, genre;
    private int yearPublished, numberofItems;
    Author author;

    // make a constructor
    public LibraryItem(String publisher, String genre, Author author, int yearPublished, int numberofItems) {
        this.publisher = publisher;
        this.genre = genre;
        this.author = author;
        this.yearPublished = yearPublished;
        this.numberofItems = numberofItems;
    }

    // Getters and Setters
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getNumberofItems() {
        return numberofItems;
    }

    public void setNumberofItems(int numberofItems) {
        this.numberofItems = numberofItems;
    }

}