package com.example.practical9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.BundleCompat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    Button submit;
    RadioButton r1, r2;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = (Button) findViewById(R.id.submit);
        radioGroup = (RadioGroup) findViewById(R.id.groupradio);
        r1 = (RadioButton) findViewById(R.id.r1);
        r2 = (RadioButton) findViewById(R.id.r2);
    }

    public void display(View view) {
        s = "";
        int selectedId = radioGroup.getCheckedRadioButtonId();
        if (r1.isChecked()) {
            s = s + " " + r1.getText();
        }
        if (r2.isChecked()) {
            s = s + " " + r2.getText();
        }
        RadioButton radioButton = (RadioButton)
                radioGroup.findViewById(selectedId);
        s = s + " " + radioButton.getText();
        // Now display the value of selected item
        // by the Toast message
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
    }
}