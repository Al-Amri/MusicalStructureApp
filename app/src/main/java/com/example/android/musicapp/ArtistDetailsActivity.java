package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ArtistDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_details);

        // Set title of this activity
        setTitle(getResources().getText(R.string.Artist_Details_Activity_Title));
    }
}
