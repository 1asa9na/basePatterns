public class Developer {
    private int salary;
    private ProgrammingLang language;
    private SkillLevel level;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setLanguage(ProgrammingLang language) {
        this.language = language;
    }

    public void setLevel(SkillLevel level) {
        this.level = level;
    }

    public void printDetails() {
        System.out.println("Programming Language: " + language);
        System.out.println("Skill Level: " + level);
        System.out.println("Salary: " + salary);
    }
}
