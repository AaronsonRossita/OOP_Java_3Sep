import java.time.LocalDate;

public class VIPUser extends User{

    private int discount;
    private LocalDate birthday;

    public VIPUser(int id, String name, int discount, LocalDate birthday) {
        super(id, name);
        this.discount = discount;
        this.birthday = birthday;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public void printName() {
        System.out.println("VIP users name is " + this.getName());
    }
}
