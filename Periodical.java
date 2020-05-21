
public class Periodical extends LibraryItem implements Reservable {

    public Periodical(String publisher, String genre, Author author, int yearPublished, int numberofBooks,
            String typeName) {
        super(publisher, genre, author, yearPublished, numberofBooks, typeName);

    }

    public Periodical() {
    }

    @Override
    public boolean isReservable(String reserveItem) {
        return true;
    }
}