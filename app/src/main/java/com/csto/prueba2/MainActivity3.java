package com.csto.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    EditText Etx_Nombre;
    EditText Etx_Edad;
    Spinner Spn_Gener;
    Button Btn_agregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Etx_Nombre=(EditText) findViewById(R.id.Id_Nombre);
        Etx_Edad=(EditText) findViewById(R.id.Id_edad);
        Spn_Gener=(Spinner) findViewById(R.id.Id_Genero);
        Btn_agregar=(Button) findViewById(R.id.Id_btn);

        Btn_agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Etx_Nombre.length() == 0 ){
                    Toast.makeText(getApplicationContext(),"Debe ingresar Nombre",Toast.LENGTH_LONG).show();
                }
                if (Etx_Edad.length() == 0 ){
                    Toast.makeText(getApplicationContext(),"Debe ingresar Edad",Toast.LENGTH_LONG).show();
                }
                else
                {

                    String Genero = Spn_Gener.getSelectedItem().toString();
                    Intent I = new Intent(getApplicationContext(),MainActivity2.class);
                    I.putExtra("GENERO",Genero);
                    startActivity(I);
                }

            }
        });

    }
}