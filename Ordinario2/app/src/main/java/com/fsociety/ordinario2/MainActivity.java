package com.fsociety.ordinario2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import xyz.hanks.library.SmallBang;
import xyz.hanks.library.SmallBangListener;

public class MainActivity extends AppCompatActivity {

    EditText txtEstatura, txtPeso;
    TextView lblResultado, lblMensaje;
    Button btnCalcular;
    private SmallBang mSmallBang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Calculadora IMC");
        mSmallBang = SmallBang.attach2Window(this);

        //Referencias a los componentes EditText
        txtEstatura = (EditText) findViewById(R.id.txtAltura);
        txtPeso = (EditText) findViewById(R.id.txtPeso);

        //Referencias a los componentes TextView
        lblResultado = (TextView) findViewById(R.id.lblResultado);
        lblMensaje = (TextView) findViewById(R.id.lblMensaje);

        //Referencia al botón
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNumber(v);
                //A partir de aquí se hace la operación
            }
        });
    }

    public void addNumber(View view) {
        mSmallBang.bang(view, new SmallBangListener() {
            @Override
            public void onAnimationStart() {
            }

            @Override
            public void onAnimationEnd() {
                Toast.makeText(MainActivity.this, "Botón 1", Toast.LENGTH_SHORT).show();
            }
        });
    }
}


