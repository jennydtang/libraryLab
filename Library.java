package Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public static void main(String[] args) {
        ChildCard cc = new ChildCard();
        List<CardHolder> persons = new ArrayList<>();
        persons.add(cc);

        CardHolder.printCanCheckout(persons);
    }

}