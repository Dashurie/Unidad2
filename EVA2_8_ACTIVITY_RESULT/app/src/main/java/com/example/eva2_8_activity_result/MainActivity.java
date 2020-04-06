package com.example.eva2_8_activity_result;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 Button btnclick, contactos, imagen, audio, video;
 Intent Hotel, cont, img, vid,aud;
 final int HOTEL = 1500;
 final int CONTACTOS = 1000;
 final int IMAGENES = 2000;
 final int VIDEOS = 3000;
 final int AUDIO = 4000;

 Uri [] uriProvider = {
   ContactsContract.Contacts.CONTENT_URI,
   MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
 };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnclick = findViewById(R.id.Btnhot);
        String hotelseleccionado = getIntent().getStringExtra("Hotels");
        contactos = findViewById(R.id.Btncon);
        audio =findViewById(R.id.Btnaudio);
        imagen = findViewById(R.id.BtnImg);
        video = findViewById(R.id.BtnVid);
         Intent img = new Intent(Intent.ACTION_PICK, uriProvider[IMAGENES]);
        Intent cont = new Intent(Intent.ACTION_PICK, uriProvider[CONTACTOS]);
        Intent vid = new Intent(Intent.ACTION_PICK, uriProvider[VIDEOS]);
        Intent aud = new Intent(Intent.ACTION_PICK, uriProvider[AUDIO]);
        Intent hotel = new Intent(Intent.ACTION_PICK, uriProvider[HOTEL]);


        }


    public void VerHoteles(View view) {

    }

    public void Videos(View view) {

    }

    public void img(View view) {
        Intent intent = new Intent();
        intent.setType("image/pictures/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivity(intent);

    }

    public void Audi(View view) {
    }

    public void Contacto(View view) {
        String myData = "content://contacts/people/";
        Intent myActivity2 = new Intent(Intent.ACTION_VIEW,
                Uri.parse(myData));
        startActivity(myActivity2);
    }
}
