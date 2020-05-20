package Library;

public class LibraryItem {
    private String publisher, genre, author;
    private int yearPublished, numberofItems;

    // make a constructor
    public LibraryItem(String publisher, String genre, String author, int yearPublished, int numberofItems) {
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
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