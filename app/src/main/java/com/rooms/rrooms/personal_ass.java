package com.rooms.rrooms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rooms.rrooms.R;

public class personal_ass extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_ass);
        button = (Button) findViewById(R.id.personalassbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save_ti();
            }
        });
    }
    public void save_ti() {
        Intent intent = new Intent(this, hostelsecond.class);
        startActivity(intent);
    }
}