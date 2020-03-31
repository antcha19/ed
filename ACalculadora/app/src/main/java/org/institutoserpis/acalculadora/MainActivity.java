package org.institutoserpis.acalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText et1,et2;
    private TextView tv1;
    private CheckBox cb1,cb2,cb3,cb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.text_num1);
        et2 = (EditText) findViewById(R.id.text_num2);
        tv1 = (TextView) findViewById(R.id.text_Resultado);
        cb1 = (CheckBox) findViewById(R.id.CB_Suma);
        cb2 = (CheckBox) findViewById(R.id.CB_Resta);
        cb3 = (CheckBox) findViewById(R.id.CB_Multiplicacion);
        cb4 = (CheckBox) findViewById(R.id.CB_Division);
    }

    public void calcular (View view) {

        int numero1 = Integer.parseInt(et1.getText().toString());
        int numero2 = Integer.parseInt(et2.getText().toString());
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multi= numero1 * numero2;
        int division = numero1 / numero2;

        String resultado = "";

        //suma
        if (cb1.isChecked() == true) {
            if (cb2.isChecked() != true && (cb3.isChecked() != true)) {
                resultado = "la suma es: " + suma + "\n";
            }else if (cb1.isChecked() == true && cb2.isChecked()==true&& (cb3.isChecked() == true)) {
                    resultado = "la suma es: " + suma + "\n" + "la resta es: " + resta + "\n" + " la multiplicacion es: " +multi+ "\n";
            }
        }
        //resta
        else if (cb2.isChecked() == true) {
            resultado = "la resta es: " + resta + "\n";
        }
        //multiplicacion
        else if (cb3.isChecked()== true) {
            if (cb1.isChecked() != true) {
                resultado = "la multiplicacion es: " + multi + "\n";
            }else if (cb1.isChecked()==true) {
                resultado = "la multiplicacion es: " + multi + "\n" + "la suma es: " + suma + "\n";
            }
        }
        //division
        else if (cb4.isChecked()==true){
            resultado = "la division es: "  +division + "\n";
        }

            tv1.setText(resultado);
        }

}
