package my.jlm;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment {
	
	public HomeFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        Button mButton = (Button) rootView.findViewById(R.id.button1);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // here you set what you want to do when user clicks your button,
            	Intent intent = new Intent(getActivity(), ProductBlitzActivity.class);
                startActivity(intent);
            }
        });
        
        Button mmButton = (Button) rootView.findViewById(R.id.button2);
        mmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // here you set what you want to do when user clicks your button,
            	Intent intent = new Intent(getActivity(), ProductMixtureActivity.class);
                startActivity(intent);
            }
        });
        
        Button mmmButton = (Button) rootView.findViewById(R.id.button3);
        mmmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // here you set what you want to do when user clicks your button,
            	Intent intent = new Intent(getActivity(), ProductVPNActivity.class);
                startActivity(intent);
            }
        });
        
        Button netbandButton = (Button) rootView.findViewById(R.id.button4);
        netbandButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // here you set what you want to do when user clicks your button,
            	Intent intent = new Intent(getActivity(), ProductNetBandActivity.class);
                startActivity(intent);
            }
        });
        
        Button netsatButton = (Button) rootView.findViewById(R.id.button5);
        netsatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // here you set what you want to do when user clicks your button,
            	Intent intent = new Intent(getActivity(), ProductNetSatActivity.class);
                startActivity(intent);
            }
        });
        
        Button ukmButton = (Button) rootView.findViewById(R.id.button6);
        ukmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // here you set what you want to do when user clicks your button,
            	Intent intent = new Intent(getActivity(), ProductUKMActivity.class);
                startActivity(intent);
            }
        });
        return rootView;
    }
}
