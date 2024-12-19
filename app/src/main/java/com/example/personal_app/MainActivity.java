package com.example.personal_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.skill) {
            Toast.makeText(this, "Skills selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.about) {
            Toast.makeText(this, "About Me selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.hobby) {
            Toast.makeText(this, "Hobbies selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.resume) {
            Toast.makeText(this, "Resume selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.links) {
            Toast.makeText(this, "Links selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.uitm) {
            Toast.makeText(this, "UiTM Website selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.portal) {
            Toast.makeText(this, "iStudent Portal selected", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

}