package com.example.android.facts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fact14 extends AppCompatActivity {
    private static Button button_nxt;
    private static Button button_pvs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact14);
        onClickListenerNext();
        onClickListenerPrevious();
    }
    public void onClickListenerNext() {
        button_nxt = (Button) findViewById(R.id.next_button14);
        button_nxt.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Fact14.this, Fact15.class);
                        startActivity(intent);

                    }
                }
        );
    }
    public void onClickListenerPrevious() {
        button_pvs = (Button) findViewById(R.id.previous_button14);
        button_pvs.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Fact14.this, Fact13.class);
                        startActivity(intent);

                    }
                }
        );
    }
}
