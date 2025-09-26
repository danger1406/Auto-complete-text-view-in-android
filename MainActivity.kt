package com.example.Myapplication

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Step 1: Reference to AutoCompleteTextView
        val autoCompleteCity: AutoCompleteTextView = findViewById(R.id.autoCompleteCity)

        // Step 2: Data source - list of cities
        val cities = listOf("New York", "Los Angeles", "Chicago", "Houston", "Phoenix",
            "Bengaluru", "Delhi", "Mumbai", "Kolkata", "Chennai")

        // Step 3: Adapter setup
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, cities)

        // Step 4: Attach adapter to AutoCompleteTextView
        autoCompleteCity.setAdapter(adapter)

        // Step 5: Handle item click events
        autoCompleteCity.setOnItemClickListener { _, _, position, _ ->
            val selectedCity = adapter.getItem(position)
            Toast.makeText(this, "You selected: $selectedCity", Toast.LENGTH_SHORT).show()
        }
    }
}
