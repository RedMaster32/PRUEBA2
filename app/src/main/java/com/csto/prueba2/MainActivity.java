package com.csto.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usuario;
    EditText contraseña;
    Button Btn_conectar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = (EditText) findViewById(R.id.Usuario);
        contraseña = (EditText) findViewById(R.id.Contraseña);
        Btn_conectar = (Button) findViewById(R.id.btn_conectar);

        Btn_conectar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Usuario = usuario.getText().toString();
                String Contraseña = contraseña.getText().toString();
                if (Usuario.equals("Adm123")&& Contraseña.equals("Adm123"))
                {
                    Intent I = new Intent(getApplicationContext(),MainActivity2.class);
                    startActivity(I);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Usuario y Contraseña Equivocada", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
