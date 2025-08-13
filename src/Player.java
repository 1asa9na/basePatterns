import java.util.ArrayList;
import java.util.Arrays;

public class Player extends UObject {

    public Player() {
        super();
        setProperty("position", new ArrayList<Double>(Arrays.asList(0.0, 0.0)));
        setProperty("velocity", new ArrayList<Double>(Arrays.asList(10.0, 10.0)));
        setProperty("angle", 0.0);
        setProperty("angleVelocity", 90.0);
    }
}
