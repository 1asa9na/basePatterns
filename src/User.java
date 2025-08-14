public class User {
    private Strategy activity;

    public void setActivity(Strategy activity) {
        this.activity = activity;
    }

    public void performActivity() {
        if (activity != null) {
            activity.execute();
        } else {
            System.out.println("No activity set.");
        }
    }
}
