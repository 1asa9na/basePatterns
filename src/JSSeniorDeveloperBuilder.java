public class JSSeniorDeveloperBuilder extends DeveloperBuilder {
    @Override
    public void buildSalary() {
        developer.setSalary(3000);
    }

    @Override
    public void buildLanguage() {
        developer.setLanguage(ProgrammingLang.JAVASCRIPT);
    }

    @Override
    public void buildLevel() {
        developer.setLevel(SkillLevel.SENIOR);
    }
}
