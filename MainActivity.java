package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int contador;
    TextView Texto;
    Button Click;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Texto = findViewById(R.id.texto);
        Click = findViewById(R.id.Click);

        Click.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                contador++;
                Texto.setText("Has clicado " + contador + " veces");
            }
        });
    }
}
