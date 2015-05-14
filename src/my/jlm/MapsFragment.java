package my.jlm;
// GOOGLE MAPS JLM
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MapsFragment extends Fragment {
	
	public MapsFragment(){}
	
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_maps, container, false);
        Button mButton = (Button) rootView.findViewById(R.id.profile);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // here you set what you want to do when user clicks your button,
            	Intent intent = new Intent(getActivity(), Maps.class);
                startActivity(intent);
            }
        });
        return rootView;
    }
}
