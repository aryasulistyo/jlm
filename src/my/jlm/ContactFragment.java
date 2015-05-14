package my.jlm;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class ContactFragment extends Fragment
implements OnClickListener	{
	private View rootView;
	ImageButton buttonCall;
	ImageButton buttonMail;
	
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        rootView = inflater.inflate(R.layout.activity_call, container, false);
         setUpViews();
        
         buttonCall = (ImageButton) rootView.findViewById(R.id.buttonCall);
         buttonMail =(ImageButton) rootView.findViewById(R.id.buttonMail);
        return rootView;
    }
   
    private void setUpViews() {
        rootView.findViewById(R.id.buttonCall).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View arg0) {
        	   switch (arg0.getId()) {
        	   
               case R.id.buttonMail:
            	   Intent intent = new Intent(getActivity(), Mail.class);
                   startActivity(intent);
               break;
        	   
               case R.id.buttonCall:
            	   
               // TODO Auto-generated method stub
               // Creating alert Dialog with two Buttons
               AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
               // Setting Dialog Title
               alertDialog.setTitle("Kontak JLM?");
               // Setting Dialog Message
               alertDialog.setMessage("021-87906175");
               // Setting Icon to Dialog
               //alertDialog.setIcon(R.drawable.warning);
               // Setting Negative "NO" Button
               alertDialog.setNegativeButton("No",
                       new DialogInterface.OnClickListener() {
                           public void onClick(DialogInterface dialog,
                                   int which) {
                               // Write your code here to execute after dialog
                               dialog.cancel();
                           }
                       });
               // Setting Positive "Yes" Button
               alertDialog.setPositiveButton("Yes",
                       new DialogInterface.OnClickListener() {
                           public void onClick(DialogInterface dialog,
                                   int which) {
                               // Write your code here to execute after dialog
                               Intent callIntent = new Intent(Intent.ACTION_CALL);
                               callIntent.setData(Uri.parse("tel:" + "62 2187906175"));
                               callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                               startActivity(callIntent);

                           }
                       });

               // Showing Alert Message
               alertDialog.show();
               
               break;
               

            	   
           }
        	  
       }});
        
        rootView.findViewById(R.id.buttonMail).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
         	   switch (arg0.getId()) {
         	   
                case R.id.buttonMail:
             	   Intent intent = new Intent(getActivity(), Mail.class);
                    startActivity(intent);
                break;
         	   
             	   
            }
         	  
        }});
        
    }
        
    

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}  }