public class DeveloperWorkspaceFactoryImpl implements WorkspaceFactory {

    @Override
    public Employee createEmployee() {
        return new Developer();
    }

    @Override
    public Office createOffice() {
        return new SmallOffice();
    }

    @Override
    public Computer createComputer() {
        return new Laptop();
    }
}
