package com.example.proyectoentrega2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView7 = (TextView) findViewById(R.id.textView7);
        Bundle bundle = this.getIntent().getExtras();
        textView7.setText(bundle.getString("PRECIO"));

        Button boton2 = (Button) findViewById(R.id.button2);

        boton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity2.this, MainActivity3.class);

                startActivity(intent2);
            }
        });
    }
}