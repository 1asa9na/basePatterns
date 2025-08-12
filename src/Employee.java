public abstract class Employee {
    protected Office office;
    protected Computer computer;

    public Employee(Office office, Computer computer) {
        this.office = office;
        this.computer = computer;
    }

    void workOffice() {
        System.out.print("in " + office.toString());
    }

    void workComputer() {
        System.out.println(" using " + computer.toString());
    }
    
    abstract void work();
}
