package Library;

public class ReferenceBook extends Book {
    private int edition;
    private String referenceType;

    public ReferenceBook(String publisher, String genre, String author, int yearPublished, int numberofBooks,
            int edition, String referenceType) {
        super(publisher, genre, author, yearPublished, numberofBooks);
        this.edition = edition;
        this.referenceType = referenceType;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public String getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }
}