public class Developer extends Employee {
    public Developer(Office office, Computer computer) {
        super(office, computer);
    }

    @Override
    void work() {
        System.out.print("Developing software ");
        workOffice();
        workComputer();
    }
}
