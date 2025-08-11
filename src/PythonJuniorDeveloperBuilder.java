public class PythonJuniorDeveloperBuilder extends DeveloperBuilder {
    @Override
    public void buildSalary() {
        developer.setSalary(1000);
    }

    @Override
    public void buildLanguage() {
        developer.setLanguage(ProgrammingLang.PYTHON);
    }

    @Override
    public void buildLevel() {
        developer.setLevel(SkillLevel.JUNIOR);
    }
}
