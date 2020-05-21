public class LibraryFactory {

    public static LibraryItem CreateItem(ItemTypes typeName) {
        LibraryItem l = null;
        if (typeName == null) {
            return null;
        }
        switch (typeName) {
            case BOOK:
                l = new Book();
                break;
            case PERIODICAL:
                l = new Periodical();
                break;
            default:
        }
        return l;

    }
}