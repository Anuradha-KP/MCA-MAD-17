package com.example.explicit_intents17;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

//SecondActivity is the destination of our explicit intent.
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second); //Set the layout for this activity
    }
}
