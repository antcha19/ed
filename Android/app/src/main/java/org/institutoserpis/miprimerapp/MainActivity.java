package org.institutoserpis.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 =(EditText) findViewById(R.id.text_num1);
        et2 =(EditText) findViewById(R.id.text_num2);
        tv1 =(TextView) findViewById(R.id.text_Resultado);

    }


    //sumar
    public void Sumar(View view) {

        //variable
        int numero1=0;
        int numero2=0;
        int suma=0;
        numero1 = Integer.parseInt(et1.getText().toString());
        numero2 = Integer.parseInt(et2.getText().toString());

         suma = numero1 + numero2;

        tv1.setText(String.valueOf(suma));
    }

    //resta
    public void Restar(View view) {

        //variable
        int numero1=0;
        int numero2=0;
        int resta=0;
        numero1 = Integer.parseInt(et1.getText().toString());
        numero2 = Integer.parseInt(et2.getText().toString());
        resta = numero1 - numero2;

        tv1.setText(String.valueOf(resta));
    }


    //multiplicacion
    public void Multiplicar(View view) {

        //variable
        int numero1=0;
        int numero2=0;
        int multi=0;
        numero1 = Integer.parseInt(et1.getText().toString());
        numero2 = Integer.parseInt(et2.getText().toString());
        multi = numero1 * numero2;

        tv1.setText(String.valueOf(multi));
    }

    //division
    public void Dividir(View view) {

        //variables
        int numero1=0;
        int numero2=0;
        int division=0;

        numero1 = Integer.parseInt(et1.getText().toString());
        numero2 = Integer.parseInt(et2.getText().toString());
        division = numero1 / numero2;

        tv1.setText(String.valueOf(division));
    }
}
