package org.udandroid.jokeactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_joke);

        Intent jokeIntent = getIntent();
        if( jokeIntent != null){
            String joke = jokeIntent.getStringExtra("joke");
            TextView jokeView = findViewById(R.id.tv_joke);
            jokeView.setText( joke );
        }
    }

}
