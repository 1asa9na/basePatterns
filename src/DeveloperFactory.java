public class DeveloperFactory implements EmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new Developer();
    }
}
