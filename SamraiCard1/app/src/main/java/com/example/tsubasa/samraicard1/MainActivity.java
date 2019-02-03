package com.example.tsubasa.samraicard1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox checkBox1 = (CheckBox)findViewById(R.id.checkBox1);
        CheckBox checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        CheckBox checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
        CheckBox checkBox4 = (CheckBox)findViewById(R.id.checkBox4);
        CheckBox checkBox5 = (CheckBox)findViewById(R.id.checkBox5);
        CheckBox checkBox6 = (CheckBox)findViewById(R.id.checkBox6);
        CheckBox checkBox7 = (CheckBox)findViewById(R.id.checkBox7);

        checkBox1.setText(R.string.drinking_check1);
        checkBox2.setText(R.string.drinking_check2);
        checkBox3.setText(R.string.drinking_check3);
        checkBox4.setText(R.string.drinking_check4);
        checkBox5.setText(R.string.drinking_check5);
        checkBox6.setText(R.string.drinking_check6);
        checkBox7.setText(R.string.drinking_check7);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view != null) {
            Intent intent = new Intent(this, DailyActivity.class);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }
    }
}
