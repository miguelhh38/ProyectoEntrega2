package com.example.proyectoentrega2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = (Button) findViewById(R.id.button);
        TextView txtPrecio = (TextView) findViewById(R.id.textView2);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                Bundle b = new Bundle();
                b.putString("PRECIO", txtPrecio.getText().toString());
                intent.putExtras(b);

                startActivity(intent);
            }
        });
    }
    public void abrirUbicacion(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:43.350911, -5.129084"));
        startActivity(i);
    }
}