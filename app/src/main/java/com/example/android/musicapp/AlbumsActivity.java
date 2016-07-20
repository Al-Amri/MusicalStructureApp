package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_albums);

        // Set title of this activity
        setTitle(getResources().getText(R.string.Albums_Activity_Title));

        // Find the View that shows the first album
        TextView artist1_album1_view = (TextView) findViewById(R.id.artist1_album1);

        // Set a click listener on the first album
        artist1_album1_view.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the first album is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link album1_DetailsIntent}
                Intent album1_DetailsIntent = new Intent(AlbumsActivity.this, AlbumDetailsActivity.class);

                // Start the songs activity
                startActivity(album1_DetailsIntent);
            }
        });


    }
}
