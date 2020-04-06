package com.example.eva2_8_activity_result;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
ListView lista;
    private String [] Hoteles = {"Palacio","La cabaña","La casa roja","Hostal","Palacio del sol",
            "Laguna azul","Sol estrellado","Luna luminosa" , "Francisco Villa", "Girasoles", "",
            "Peshe hotel","El leñador","Lilith","Villa bonita","Otros"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lista = findViewById(R.id.Listhotel);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Hoteles);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Main2Activity.this, "El hotel seleccionado es :" + lista.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
