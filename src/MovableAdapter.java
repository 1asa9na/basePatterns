import java.util.ArrayList;
import java.util.List;

public class MovableAdapter implements Movable {
    private UObject obj;

    public MovableAdapter(UObject obj) {
        this.obj = obj;
    }

    @Override
    public void setPosition(List<Double> position) {
        obj.setProperty("position", position);
    }

    @Override
    public void setVelocity(List<Double> velocity) {
        obj.setProperty("velocity", velocity);
    }

    @Override
    public List<Double> getPosition() {
        List<?> list = (List<?>) obj.getProperty("position");
        List<Double> newList = new ArrayList<Double>();
        for (Object o : list) {
            if (o instanceof Double) {
                newList.add((Double) o);
            } else {
                throw new IllegalArgumentException("Position must be a list of Doubles");
            }
        }
        return newList;
    }

    @Override
    public List<Double> getVelocity() {
        List<?> list = (List<?>) obj.getProperty("velocity");
        List<Double> newList = new ArrayList<Double>();
        for (Object o : list) {
            if (o instanceof Double) {
                newList.add((Double) o);
            } else {
                throw new IllegalArgumentException("Velocity must be a list of Doubles");
            }
        }
        return newList;
    }
}
