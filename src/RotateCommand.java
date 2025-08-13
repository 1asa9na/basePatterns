public class RotateCommand implements Command {
    private Rotatable rotatable;

    public RotateCommand(Rotatable rotatable) {
        this.rotatable = rotatable;
    }

    @Override
    public void run() {
        rotatable.setAngle(rotatable.getAngle() + rotatable.getAngleVelocity());
    }
    
}
