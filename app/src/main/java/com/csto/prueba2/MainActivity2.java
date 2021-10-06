package com.csto.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    ImageButton BTN_IMG;
    String Genero;
    TextView Total;
    TextView T_Hombre;
    TextView T_Mujer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Total = (TextView) findViewById(R.id.txt_total);
        T_Hombre = (TextView) findViewById(R.id.txt_hombre);
        T_Mujer = (TextView) findViewById(R.id.txt_Mujer);
        BTN_IMG = (ImageButton) findViewById(R.id.Btn_img);
        Bundle B = getIntent().getExtras();
        BTN_IMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent I = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(I);
            }
        });

        Genero = B.getString("GENERO");

        if ((Genero.equals("Hombre")))
        {
            T_Hombre.setText(Genero);
        }
        if ((Genero.equals("Mujer")))
        {
            T_Mujer.setText(Genero);
        }



    }
}