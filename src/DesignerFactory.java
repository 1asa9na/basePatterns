public class DesignerFactory implements EmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new Designer();
    }
}
