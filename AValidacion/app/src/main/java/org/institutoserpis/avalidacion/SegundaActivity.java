package org.institutoserpis.avalidacion;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity {

    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        tv2= (TextView) findViewById(R.id.textparte);
        String info=getIntent().getStringExtra("nombre");
        tv2.setText("Bienvenido " + info);

    }
    public void cerrar(View view){

        Intent cerrar = new Intent(this, MainActivity.class);
        startActivity(cerrar);
        Toast.makeText(this,"CERRANDO", Toast.LENGTH_LONG).show();
    }
}
