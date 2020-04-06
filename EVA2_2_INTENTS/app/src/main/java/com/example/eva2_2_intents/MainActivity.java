package com.example.eva2_2_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Intent intento;
    Button btnmarcar, btnllamar;
    EditText tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tel = findViewById(R.id.edittel);

    }

    public void Marcar(View view) {
        String numero = tel.getText().toString();
        if(view.getId() == R.id.btnmarcar) {
            intento = new Intent(Intent.ACTION_DIAL, Uri.parse(numero));
            startActivity(intento);
        }
        if(view.getId()== R.id.Btnllamar){
            intento = new Intent(Intent.ACTION_CALL, Uri.parse(numero));
            startActivity(intento);
        }
    }
}
