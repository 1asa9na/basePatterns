public class RotatableAdapter implements Rotatable {
    private UObject obj;

    public RotatableAdapter(UObject obj) {
        this.obj = obj;
    }

    @Override
    public void setAngle(double angle) {
        obj.setProperty("angle", angle);
    }

    @Override
    public double getAngle() {
        return (double) obj.getProperty("angle");
    }

    @Override
    public double getAngleVelocity() {
        return (double) obj.getProperty("angleVelocity");
    }

    @Override
    public void setAngleVelocity(double angleVelocity) {
        obj.setProperty("angleVelocity", angleVelocity);
    }

}
