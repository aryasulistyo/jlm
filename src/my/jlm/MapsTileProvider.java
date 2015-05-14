package my.jlm;

import java.net.MalformedURLException;
import java.net.URL;
 
import com.google.android.gms.maps.model.UrlTileProvider;
 
public class MapsTileProvider extends UrlTileProvider{
 
    private String baseURL;
 
    public MapsTileProvider(int width, int height, String url) {
        super(width, height);
            this.baseURL = url;
    }
 
    @Override
    public URL getTileUrl(int x, int y, int zoom) {
        try {
            return new URL(baseURL.replace("{z}", ""+zoom).replace("{x}",""+x).replace("{y}",""+y));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            return null;
    }
}