public abstract class DeveloperBuilder {
    protected Developer developer;

    public void createNewDeveloper() {
        developer = new Developer();
    }

    public abstract void buildSalary();
    public abstract void buildLanguage();
    public abstract void buildLevel();

    public Developer getDeveloper() {
        return developer;
    }
}
