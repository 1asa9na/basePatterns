import java.util.Map;

import static java.util.Map.entry;

public class App {
    static final Map<Integer, Class<? extends EmployeeFactory>> factories = Map.ofEntries(
        entry(0, DeveloperFactory.class),
        entry(1, DesignerFactory.class),
        entry(2, AdministratorFactory.class)
    );

    public static void main(String[] args) throws Exception {
        int query = 1;
        createEmployeeFactory(query).createEmployee().printSpecialty();
    }

    public static EmployeeFactory createEmployeeFactory(int query) throws Exception {
        Class<? extends EmployeeFactory> factoryClass = factories.get(query);
        if (factoryClass != null) {
            return factoryClass.getDeclaredConstructor().newInstance();
        }
        throw new IllegalArgumentException("No factory found for query: " + query);
    }
}
