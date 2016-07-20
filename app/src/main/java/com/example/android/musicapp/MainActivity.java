package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the songs category
        TextView songs = (TextView) findViewById(R.id.songs);

        // Set a click listener on the Songs View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);

                // Start the songs activity
                startActivity(songsIntent);
            }
        });

        // Find the View that shows the albums category
        TextView albums = (TextView) findViewById(R.id.albums);

        // Set a click listener on the Albums View
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the albums category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumsActivity}
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);

                // Start the songs activity
                startActivity(albumsIntent);
            }
        });

        // Find the View that shows the artists category
        TextView artists = (TextView) findViewById(R.id.artists);

        // Set a click listener on the Albums View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artists category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumsActivity}
                Intent albumsIntent = new Intent(MainActivity.this, ArtistsActivity.class);

                // Start the songs activity
                startActivity(albumsIntent);
            }
        });

    }
}
