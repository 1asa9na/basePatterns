public class DesignerWorkspaceFactoryImpl implements WorkspaceFactory {

    @Override
    public Employee createEmployee() {
        return new Designer();
    }

    @Override
    public Office createOffice() {
        return new LargeOffice();
    }

    @Override
    public Computer createComputer() {
        return new Desktop();
    }
}
