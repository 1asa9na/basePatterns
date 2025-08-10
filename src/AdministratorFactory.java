public class AdministratorFactory implements EmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new Administrator();
    }
}
