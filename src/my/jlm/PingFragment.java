package my.jlm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class PingFragment extends Fragment
implements OnClickListener {
        EditText edit;
        TextView text;
        Button button;
        Editable Edit2 ;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.activity_ping, container, false);


            EditText edit = (EditText) rootView.findViewById(R.id.editText1);
            edit.setText("192.168.1.1");
            Edit2 = edit.getText();
            text = (TextView) rootView.findViewById(R.id.textView1);
            button = (Button) rootView.findViewById(R.id.button1);
            button.setOnClickListener(this);

            return rootView;
        }



        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.button1:


                    try {
                        String pingCmd = "ping -c 5 " + Edit2;
                        String pingResult = "";
                        Runtime r = Runtime.getRuntime();
                        Process p = r.exec(pingCmd);
                        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
                        String inputLine;
                        while ((inputLine = in .readLine()) != null) {
                            System.out.println(inputLine);
                            text.setText(inputLine + "\n\n");
                            pingResult += inputLine;
                            text.setText(pingResult);
                        } in .close();
                    } //try
                    catch (IOException e) {
                        System.out.println(e);
                    }
                    break;


            }
        }
     }