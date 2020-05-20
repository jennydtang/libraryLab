package Library;

import java.util.List;

public abstract class CardHolder {
    private String ageGroup;
    private int age;
    private boolean outstandingFees;

    public CardHolder() {
        this.ageGroup = "Adult";
        this.age = 18;
        this.outstandingFees = false;
    }

    public CardHolder(String ageGroup, int age, boolean outstandingFees) {
        this.ageGroup = ageGroup;
        this.age = age;
        this.outstandingFees = outstandingFees;
    }

    public static void printCanCheckout(List<CardHolder> persons) {
        for (CardHolder c : persons) {
            System.out.println(c.toString() + "is able to check out books?");
        }
    }

    public abstract boolean CanCheckoutBooks(String ageGroup);

    @Override
    public String toString() {
        return this.ageGroup + " is able to checkout books.";
    }

}