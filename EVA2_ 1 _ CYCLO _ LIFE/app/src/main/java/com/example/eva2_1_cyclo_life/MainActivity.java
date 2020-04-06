package com.example.eva2_1_cyclo_life;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText txtMsg;
Button btnExit;
TextView txtSpy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMsg = findViewById(R.id.txtmsg);
        txtSpy = findViewById(R.id.txtSpy);
        btnExit = findViewById(R.id.btnExit);
        Toast.makeText(this, "onCreate",1).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences myFile1 = getSharedPreferences("myFile1",
                MainActivity.MODE_PRIVATE);
        SharedPreferences.Editor myEditor = myFile1.edit();
        String temp = txtMsg.getText().toString();
        myEditor.putString("mydata", temp);
        myEditor.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences myFile = getSharedPreferences("myFile1",
                MainActivity.MODE_PRIVATE);
        if ( (myFile != null) && (myFile.contains("mydata")) ) {
            String temp = myFile.getString("mydata", "***");
            txtMsg.setText(temp);
    }}

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    public void exit(View view) {
        finish();
    }
}
