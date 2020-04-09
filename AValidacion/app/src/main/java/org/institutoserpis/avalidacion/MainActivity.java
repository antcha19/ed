package org.institutoserpis.avalidacion;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.text_nombre);
        et2 = (EditText) findViewById(R.id.text_contrasena);
    }


    public void validar (View view){

        String nombre = et1.getText().toString();
        String contrasena = et2.getText().toString();

        try {
            if (nombre.length() ==0){
                Toast.makeText(this,"DEBES INTRODUCIR UN NOMBRE", Toast.LENGTH_LONG).show();
            }
            if (contrasena.length() ==0){
                Toast.makeText(this,"DEBES INTRODUCIR UNA CONTRASEÑA", Toast.LENGTH_LONG).show();
            }

            if (nombre.length() !=0 &&  contrasena.length() !=0){
                Toast.makeText(this,"VALIDANDO", Toast.LENGTH_LONG).show();
                Intent validar = new Intent(this, SegundaActivity.class);
                validar.putExtra("nombre",et1.getText().toString());
                startActivity(validar);


            }
        }catch(Exception e){
            Toast.makeText(this,"DEBES INTRODUCIR LOS DATOS", Toast.LENGTH_LONG).show();
        }

    }
}
