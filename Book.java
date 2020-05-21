
public class Book extends LibraryItem implements Loanable, Reservable {

    public Book(String publisher, String genre, Author author, int yearPublished, int numberofBooks, String typeName) {
        super(publisher, genre, author, yearPublished, numberofBooks, typeName);

    }

    public Book() {
    }

    @Override
    public boolean isLoanable(String itemName) {
        return true;
    }

    @Override
    public boolean isReservable(String reserveItem) {
        return true;
    }

}
