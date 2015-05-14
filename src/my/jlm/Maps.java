package my.jlm;
 
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnCameraChangeListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
	
public class Maps extends FragmentActivity {
	
	private GoogleMap map; 
	
	private LatLng Peta  = new LatLng(8.504684, 115.25406);
	
	private LatLng Alamat1 = new LatLng(-6.478803, 106.864093);
	private LatLng Alamat2 = new LatLng(-6.478094, 106.863682);
	private LatLng Alamat3 = new LatLng(3.568175, 98.649477);
	private LatLng Alamat4 = new LatLng(-6.918260, 107.610477);
		
	private String osmURL = "http://a.tile.openstreetmap.org/{z}/{x}/{y}.png";
	private MapsTileProvider mTileProvider = new MapsTileProvider(256, 256, osmURL);
	
	@Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_maps);
	        
	        SupportMapFragment mapFrag = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
	        map = mapFrag.getMap();
	        map.setMyLocationEnabled(true);
	        
	               
	        map.addMarker(new MarkerOptions()
    			.position(Alamat1)
    			.icon(BitmapDescriptorFactory
    			.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
    			.title("Jala Lintas Media").snippet("JLM Cibinong"));
	        map.addMarker(new MarkerOptions()
				.position(Alamat2)
				.icon(BitmapDescriptorFactory
				.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
				.title("Jala Lintas Media").snippet("JLM Jakarta"));
	        map.addMarker(new MarkerOptions()
			.position(Alamat3)
			.icon(BitmapDescriptorFactory
			.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
			.title("Jala Lintas Media").snippet("JLM Medan"));
	        map.addMarker(new MarkerOptions()
			.position(Alamat4)
			.icon(BitmapDescriptorFactory
			.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
			.title("Jala Lintas Media").snippet("JLM Bandung"));
	        
	        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Peta, 3));
	        
	        map.setOnCameraChangeListener(new OnCameraChangeListener() {
	            @Override
	            public void onCameraChange(CameraPosition campos) {
	                map.addTileOverlay(new TileOverlayOptions().tileProvider(mTileProvider));
	            }
	        });
	    }
	}