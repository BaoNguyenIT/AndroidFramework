package android.bignerdranch.com;

/**
 * Created by PATRICKLAGGER on 1/8/2018.
 */

public class Sound {
    private String mAssetPath;
    private String mName;

    public Sound(String assetPath){
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(".wav", "");
    }

    public  String getmAssetPath() {
        return  mAssetPath;
    }

    public String getName() {
        return  mName;
    }
}
