package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SongDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_song_details.xml layout file
        setContentView(R.layout.activity_song_details);

        // Set title of this activity
        setTitle(getResources().getText(R.string.Songs_Details_Activity_Title));

    }
}
