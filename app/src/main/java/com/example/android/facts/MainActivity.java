package com.example.android.facts;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 private static Button button_sbm1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickListener();

    }
 public void onClickListener() {
     button_sbm1 = (Button) findViewById(R.id.next_button1);
     button_sbm1.setOnClickListener(
             new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     Intent intent = new Intent("com.example.android.facts.Fact02");
                     startActivity(intent);

                 }
             }
     );
 }


}
