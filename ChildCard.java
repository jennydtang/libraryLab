package Library;

public class ChildCard extends CardHolder {
    public ChildCard() {
        super("young", 5, false);

    }

    @Override
    public boolean CanCheckoutBooks(String ageGroup) {
        if (ageGroup.equalsIgnoreCase("young")) {
            return false;
        } else {
            return true;
        }
    }

}