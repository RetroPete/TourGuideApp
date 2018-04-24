package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.first_activity);

        ImageView imageFirstScreen = findViewById(R.id.first_screen_image);

        imageFirstScreen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent firstScreenImageIntent = new Intent(FirstActivity.this, MainActivity.class);
                startActivity(firstScreenImageIntent);
            }
        });
    }
}