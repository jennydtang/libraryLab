public class OverdueList<E extends LibraryItem> {
    private E someItem;

    public OverdueList(E someItem) {
        this.someItem = someItem;
    }

    public E getSomeBook() {
        return this.someItem;
    }

    // Do Something here
    public void printWarning() {
        System.out.println(this.someItem + " is overdue");
    }

}