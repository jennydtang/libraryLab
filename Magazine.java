
public class Magazine extends Periodical {
    private int edition;
    private String topicofInterest, publicationFrequency;

    public Magazine(String publisher, String genre, Author author, int yearPublished, int numberofBooks, int edition,
            String topicofInterest, String publicationFrequency, String typeName) {
        super(publisher, genre, author, yearPublished, numberofBooks, typeName);
        this.topicofInterest = topicofInterest;
        this.publicationFrequency = publicationFrequency;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public String gettopicofInterest() {
        return topicofInterest;
    }

    public void settopicofInterest(String topicofInterest) {
        this.topicofInterest = topicofInterest;
    }

    public String getPublicationFrequency() {
        return publicationFrequency;
    }

    public void setPublicationFrequency(String publicationFrequency) {
        this.publicationFrequency = publicationFrequency;
    }
}