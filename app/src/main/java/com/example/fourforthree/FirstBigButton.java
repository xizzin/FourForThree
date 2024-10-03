package com.example.fourforthree;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class FirstBigButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView txt = new TextView(this);
        txt.setText("группы");
        txt.setTextSize(50);
        txt.setGravity(Gravity.CENTER);

        Button t50 = new MaterialButton(this);
        t50.setText("T50-11-23");
        Button p50 = new MaterialButton(this);
        p50.setText("П50-11-22");
        Button e50 = new MaterialButton(this);
        e50.setText("Э50-11-23");
        Button backButton = new MaterialButton(this);
        backButton.setText("Вернуться");

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstBigButton.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(txt);
        layout.addView(t50);
        layout.addView(p50);
        layout.addView(e50);
        layout.addView(backButton);
        layout.setGravity(Gravity.CENTER); // выравнивание линейного макета по центру экрана
        layout.setLayoutParams(params);
        setContentView(layout);
    }
}