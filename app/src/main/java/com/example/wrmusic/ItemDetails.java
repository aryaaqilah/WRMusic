package com.example.wrmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class ItemDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_nav_menu, menu);
        MenuItem item = menu.findItem(R.id.settings);
        EditText editText = (EditText) item.getActionView().findViewById(R.id.edit_text);
        // Lakukan sesuatu dengan editText jika perlu
        return true;
    }

}