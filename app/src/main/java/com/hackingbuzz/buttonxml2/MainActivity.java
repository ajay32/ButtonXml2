package com.hackingbuzz.buttonxml2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
    }

    public void clickme(View view) {

        //View tells which button is clicked it has got reference(ID)  to all button


   //     Log.i("BUTTON" ,"Button was clicked"); // checking if its working fine

      //  Log.i("BUTTON", view.getId() + " Button Clicked");

        if(view.getId() == R.id.button1) {
            textView.setText("Button One is Clicked");
        } else if(view.getId() == R.id.button2) {

            textView.setText("Button 2 is Clicked");
        }

        }
}
