public class HR {
    private DeveloperBuilder dBuilder;
    
    public HR(DeveloperBuilder dBuilder) {
        this.dBuilder = dBuilder;
    }

    public Developer buildDeveloper() {
        dBuilder.createNewDeveloper();
        dBuilder.buildSalary();
        dBuilder.buildLanguage();
        dBuilder.buildLevel();
        return dBuilder.getDeveloper();
    }
}
