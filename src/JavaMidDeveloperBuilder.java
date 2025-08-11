public class JavaMidDeveloperBuilder extends DeveloperBuilder {
    @Override
    public void buildSalary() {
        developer.setSalary(2000);
    }

    @Override
    public void buildLanguage() {
        developer.setLanguage(ProgrammingLang.JAVA);
    }

    @Override
    public void buildLevel() {
        developer.setLevel(SkillLevel.MID);
    }
}
