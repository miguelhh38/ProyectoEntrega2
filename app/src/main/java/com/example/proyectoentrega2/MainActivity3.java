package com.example.proyectoentrega2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button boton3 = (Button) findViewById(R.id.button3);
        EditText txtNombre = (EditText) findViewById(R.id.editText2);


        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity3.this, MainActivity4.class);

                Bundle b = new Bundle();
                b.putString("NOMBRE", txtNombre.getText().toString());
                intent3.putExtras(b);

                startActivity(intent3);
            }
        });
    }
}