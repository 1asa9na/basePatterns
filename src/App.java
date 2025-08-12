public class App {
    public static void main(String[] args) throws Exception {
        Office desOffice = Office.SALES;
        Computer desComputer = Computer.DESKTOP;

        Office devOffice = Office.IT;
        Computer devComputer = Computer.LAPTOP;

        Employee emp1 = new Designer(desOffice, desComputer);
        emp1.work();

        Employee emp2 = new Developer(devOffice, devComputer);
        emp2.work();
    }
}
