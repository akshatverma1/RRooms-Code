package com.rooms.rrooms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rooms.rrooms.R;

public class save_timeeee extends AppCompatActivity {
    private Button button;

    private Button buttonn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_timeeee);


        button = (Button) findViewById(R.id.savemoneybutton);
        buttonn = (Button) findViewById(R.id.savemoneybutton2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save_time();
            }
        });

     buttonn.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View view){
        save_timew();
    }
    });
}

    public void save_time() {
        Intent intent = new Intent(this, save_time.class);
        startActivity(intent);
    }




    public void save_timew() {
        Intent intent = new Intent(this, hostelsecond.class);
        startActivity(intent);
    }

}


