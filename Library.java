
import java.util.ArrayList;
import java.util.List;

public class Library {
    public static void main(String[] args) {
        LibraryItem Book = LibraryFactory.CreateItem(ItemTypes.BOOK);
        LibraryItem Periodical = LibraryFactory.CreateItem(ItemTypes.PERIODICAL);
        List<LibraryItem> items = new ArrayList<>();
        items.add(Book);
        items.add(Periodical);
        LibraryItem.printIsHere(items);
    }

}