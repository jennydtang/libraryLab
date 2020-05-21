
public class Periodical extends LibraryItem implements Reservable {

    public Periodical(String publisher, String genre, Author author, int yearPublished, int numberofBooks) {
        super(publisher, genre, author, yearPublished, numberofBooks);

    }

    @Override
    public boolean isReservable(String reserveItem) {
        return true;
    }
}