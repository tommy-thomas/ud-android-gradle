package org.udandroid.jokeactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_joke);

        TextView jokeView = findViewById(R.id.tv_joke);
        jokeView.setVisibility(View.GONE);

        ProgressBar pgsBar = (ProgressBar)findViewById(R.id.progress_loader);

        Intent jokeIntent = getIntent();
        if( jokeIntent != null && jokeIntent.hasExtra("joke") ){
            String joke = jokeIntent.getStringExtra("joke");
            jokeView.setText( joke );
            jokeView.setVisibility(View.VISIBLE);
            pgsBar.setVisibility(View.GONE);
        }

    }

}
