package com.example.eva2_31_sms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Intent sms;
    Button enviar;
    EditText telefono, mensaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enviar = findViewById(R.id.BtnEnv);



    }

    public void enviar(View view) {
        String tel = "smsto: " + telefono.getText().toString();
        String sms = mensaje.getText().toString();
        sms = new Intent(Intent.ACTION_SEND.);

    }
}
