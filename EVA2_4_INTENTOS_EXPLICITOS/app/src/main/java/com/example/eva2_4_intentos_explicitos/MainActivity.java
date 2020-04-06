package com.example.eva2_4_intentos_explicitos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button ir;
Intent go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        go = new Intent(this, Main2Activity.class);
    ir = findViewById(R.id.btnir);
    }

    public void ir(View view) {
        startActivity(go);
    }
}
