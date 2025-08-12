public abstract class Icon {
    private String name;

    public Icon(String name) {
        this.name = name;
        System.out.println("Icon created: " + name);
    }

    public String getName() {
        return name;
    }

    public abstract void display();
}
