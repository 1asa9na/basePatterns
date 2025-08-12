import java.util.HashMap;
import java.util.Map;

public class AssetController {
    Map<Integer, Icon> assetMap;

    public AssetController() {
        assetMap = new HashMap<>();
    }

    public Icon getAssetById(int id) {
        Icon asset = assetMap.get(id);
        return asset;
    }

    public void addAsset(int id, Icon asset) {
        assetMap.put(id, asset);
        System.out.println("Added asset: " + asset.getName() + " with ID: " + id);
    }
}
