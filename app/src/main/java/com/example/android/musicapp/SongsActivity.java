package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_songs.xml layout file
        setContentView(R.layout.activity_songs);

        // Set title of this activity
        setTitle(getResources().getText(R.string.Songs_Activity_Title));

        // Find the View that shows the first song
        TextView artist1_album1_song1_view = (TextView) findViewById(R.id.artist1_album1_song1);

        // Set a click listener on each Song
        artist1_album1_song1_view.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the first song is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent songDetailsIntent = new Intent(SongsActivity.this, SongDetailsActivity.class);

                // Start the songs activity
                startActivity(songDetailsIntent);
            }
        });
    }
}
