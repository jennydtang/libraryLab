
import java.util.List;

public class CardHolder {
    private String ageGroup;
    private int age;
    private boolean checkout, reserve;
    private List<OverdueList> overdueItems;

    public CardHolder(String ageGroup, int age, boolean checkout, boolean reserve, List<OverdueList> overdueItems) {
        this.ageGroup = ageGroup;
        this.age = age;
        this.checkout = checkout;
        this.reserve = reserve;
        this.overdueItems = overdueItems;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCheckout() {
        return checkout;
    }

    public void setCheckout(boolean checkout) {
        this.checkout = checkout;
    }

    public boolean isReserve() {
        return reserve;
    }

    public void setReserve(boolean reserve) {
        this.reserve = reserve;
    }

    public List<OverdueList> getOverdueItems() {
        return overdueItems;
    }

    public void setOverdueItems(List<OverdueList> overdueItems) {
        this.overdueItems = overdueItems;
    }

}