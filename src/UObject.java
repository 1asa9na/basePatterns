import java.util.HashMap;
import java.util.Map;

public abstract class UObject {
    private Map<String, Object> properties;

    public UObject() {
        properties = new HashMap<>();
    }

    public Object getProperty(String key) {
        return properties.get(key);
    }

    public void setProperty(String key, Object value) {
        properties.put(key, value);
    }
}
