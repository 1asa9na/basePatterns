public class Designer extends Employee {
    public Designer(Office office, Computer computer) {
        super(office, computer);
    }

    @Override
    void work() {
        System.out.print("Designing user interfaces ");
        workOffice();
        workComputer();
    }
}
