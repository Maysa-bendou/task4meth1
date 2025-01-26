package com.ln1.task4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the "More Options" button and the section containing additional options
        Button moreOptionsButton = findViewById(R.id.moreOptionsButton);
        LinearLayout hiddenButtonsSection = findViewById(R.id.hiddenButtonsSection);

        // Initialize the other buttons that perform actions
        Button addButton = findViewById(R.id.addButton);
        Button deleteButton = findViewById(R.id.deleteButton);
        Button searchButton = findViewById(R.id.searchButton);
        Button editButton = findViewById(R.id.editButton);
        Button afficherToutButton = findViewById(R.id.afficherToutButton);

        // Toggle visibility of the hidden options when the "More Options" button is clicked
        moreOptionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // If the hidden section is not visible, show it. Otherwise, hide it.
                if (hiddenButtonsSection.getVisibility() == View.GONE) {
                    hiddenButtonsSection.setVisibility(View.VISIBLE);
                    moreOptionsButton.setText("Show Less Options");
                } else {
                    hiddenButtonsSection.setVisibility(View.GONE);
                    moreOptionsButton.setText("More Options");
                }
            }
        });

        // Placeholder functionality for each action button (you can later add actual functionality)
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Placeholder for "Add" button functionality
                // You could add a dialog to add a new item or something else here
            }
        });

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Placeholder for "Delete" button functionality
                // Add the logic to delete an item here
            }
        });

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Placeholder for "Search" button functionality
                // This could trigger a search feature in the app
            }
        });

        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Placeholder for "Edit" button functionality
                // You can allow the user to edit details here
            }
        });

        afficherToutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Placeholder for "Afficher Tout" button functionality
                // This could show all available items or content in the app
            }
        });
    }
}

