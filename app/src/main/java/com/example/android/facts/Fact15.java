package com.example.android.facts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fact15 extends AppCompatActivity {
    private static Button button_nxt;
    private static Button button_pvs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact15);
        onClickListenerPrevious();
    }


    public void onClickListenerPrevious() {
        button_pvs = (Button) findViewById(R.id.previous_button15);
        button_pvs.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Fact15.this, Fact14.class);
                        startActivity(intent);

                    }
                }
        );
    }
}
