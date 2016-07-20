package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        // Set the title
        // Set title of this activity
        setTitle(getResources().getText(R.string.Artists_Activity_Title));

        // Find the View that shows the first song
        TextView artist1_view = (TextView) findViewById(R.id.artist1);

        // Set a click listener on each Artist
        artist1_view.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the first artist is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent songDetailsIntent = new Intent(ArtistsActivity.this, ArtistDetailsActivity.class);

                // Start the songs activity
                startActivity(songDetailsIntent);
            }
        });

    }
}
