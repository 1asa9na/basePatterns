public class App {
    public static void main(String[] args) throws Exception {
        WorkspaceFactory workspaceFactory = new DesignerWorkspaceFactoryImpl();
        
        workspaceFactory.createEmployee().printSpeciality();
        workspaceFactory.createOffice().printInfo();
        workspaceFactory.createComputer().printModel();
    }
}
