package com.example.proyectoentrega2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String[] datos = new String[] {"Muy buena gestión", "Regular", "Mala experiencia"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos);
        spinner.setAdapter(adapter);

        TextView txtName = (TextView) findViewById(R.id.textView9);
        Bundle bundle = this.getIntent().getExtras();
        txtName.setText("Gracias " + bundle.getString("NOMBRE"));

    }

    public void abrirNavegador(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.es"));
        startActivity(i);
    }
}