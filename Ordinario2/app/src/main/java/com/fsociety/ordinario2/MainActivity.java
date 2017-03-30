package com.fsociety.ordinario2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtEstatura, txtPeso;
    TextView lblResultado, lblMensaje;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Calculadora IMC");

        //Referencias a los componentes EditText
        txtEstatura = (EditText) findViewById(R.id.txtAltura);
        txtPeso = (EditText) findViewById(R.id.txtPeso);

        //Referencias a los componentes TextView
        lblResultado = (TextView) findViewById(R.id.lblResultado);
        lblMensaje = (TextView) findViewById(R.id.lblMensaje);

        //Referencia al botón
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
    }
}
