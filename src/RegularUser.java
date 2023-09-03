import java.time.LocalDate;

public class RegularUser extends User{

    private LocalDate registerDate;

    public RegularUser(int id, String name, LocalDate registerDate) {
        super(id, name);
        this.registerDate = registerDate;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public void printName() {
        System.out.println("Regular users name is " + this.getName());
    }
}
