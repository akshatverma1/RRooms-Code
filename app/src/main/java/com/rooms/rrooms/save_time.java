package com.rooms.rrooms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rooms.rrooms.R;

public class save_time extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_time);
        button = (Button) findViewById(R.id.savetimebutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save_tim();
            }
        });
    }
    public void save_tim(){
        Intent intent = new Intent(this, personal_ass.class);
        startActivity(intent);
    }
}