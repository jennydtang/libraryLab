
public class Book extends LibraryItem implements Loanable {

    public Book(String publisher, String genre, Author author, int yearPublished, int numberofBooks) {
        super(publisher, genre, author, yearPublished, numberofBooks);

    }

    @Override
    public boolean isLoanable(String itemName) {
        return true;
    }

}
