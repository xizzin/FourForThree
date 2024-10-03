package com.example.fourforthree;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button ForThree = new MaterialButton(this);
        ForThree.setText("на тройку");

        Button ForFour = new MaterialButton(this);
        ForFour.setText("на четверку");

        Button ForFive =  new MaterialButton(this);
        ForFive.setText("на пятерку");

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(ForThree);
        layout.addView(ForFour);
        layout.addView(ForFive);

        layout.setGravity(Gravity.CENTER); // выравнивание линейного макета по центру экрана

        setContentView(layout);

        ForThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FirstBigButton.class);
                startActivity(intent);
            }
        });

        ForFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondBigButton.class);
                startActivity(intent);
            }
        });

        ForFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThirdBigButton.class);
                startActivity(intent);
            }
        });
    }
}