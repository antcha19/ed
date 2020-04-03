package org.institutoserpis.acalculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText et1, et2;
    private TextView tv1;
    private RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et1 = (EditText) findViewById(R.id.text_num1);
        et2 = (EditText) findViewById(R.id.text_num2);
        tv1 = (TextView) findViewById(R.id.text_Resultado);
        rb1 = (RadioButton) findViewById(R.id.RB_Suma);
        rb2 = (RadioButton) findViewById(R.id.RB_Resta);
        rb3 = (RadioButton) findViewById(R.id.RB_Multiplicacion);
        rb4 = (RadioButton) findViewById(R.id.RB_Division);


    }

    public void Calcular(View view) {

        int numero1 = Integer.parseInt(et1.getText().toString());
        int numero2 = Integer.parseInt(et2.getText().toString());

        if (rb1.isChecked() == true) {
            int suma = numero1 + numero2;
            tv1.setText(String.valueOf(suma));

        } else if (rb2.isChecked() == true) {
            int resta = numero1 - numero2;
            tv1.setText(String.valueOf(resta));

        } else if (rb3.isChecked() == true) {
            int multiplicacion = numero1 * numero2;
            tv1.setText(String.valueOf(multiplicacion));

        } else if (rb4.isChecked() == true) {
           try {
                int division = numero1 / numero2;
                tv1.setText(String.valueOf(division));
                if (division == 0) {
                    Toast.makeText(this, "la operacion no es posible, no se puede dividir entre cero", Toast.LENGTH_LONG).show();
                }
            } catch (Exception e) {
               Toast.makeText(this, "la operacion no es posible, no se puede dividir entre cero", Toast.LENGTH_LONG).show();
            }
        }

    }
}

