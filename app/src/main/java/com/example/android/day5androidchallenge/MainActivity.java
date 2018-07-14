package com.example.android.day5androidchallenge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    //Handles the on click radiobutton events
    public void onRadioButtonClicked(View view) {
        TextView text = (TextView) findViewById(R.id.textView);
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();//checks whether the button is checked returns true/false

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.buttonOne:
                if (checked)
                    text.setText("You have selected the first Radiobutton");

                break;
            case R.id.buttonTwo:
                if (checked)
                    text.setText("You have selected the second Radiobutton");
                break;
            case R.id.buttonThree:
                if (checked)
                    text.setText("You have selected the third Radiobutton");

                break;
            case R.id.buttonFour:
                if (checked)
                    text.setText("You have selected the fourth Radiobutton");

                break;
        }
    }
}
