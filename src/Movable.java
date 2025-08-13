import java.util.List;

public interface Movable {

    public void setPosition(List<Double> position);

    public void setVelocity(List<Double> velocity);

    public List<Double> getPosition();

    public List<Double> getVelocity();
}
