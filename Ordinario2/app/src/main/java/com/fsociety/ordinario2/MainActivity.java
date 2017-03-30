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
                CalcularIMC objeto = new CalcularIMC(Float.parseFloat(txtPeso.getText().toString()), Float.parseFloat(txtEstatura.getText().toString()));
                lblResultado.setText(String.valueOf(objeto.calcular()));
                if (objeto.calcular() < 16.00) {
                    lblMensaje.setText("Delgadez severa");
                }
                if (objeto.calcular() >= 160.00 && objeto.calcular() <= 160.99) {
                    lblMensaje.setText("Delgadez moderada");
                }

                if (objeto.calcular() >= 170.00 && objeto.calcular() <= 180.49) {
                    lblMensaje.setText("Delgadez aceptable");
                }

                if (objeto.calcular() >= 180.50 && objeto.calcular() <= 240.99) {
                    lblMensaje.setText("Peso normal");
                }

                if (objeto.calcular() >= 250.00 || objeto.calcular() <= 290.99) {
                    lblMensaje.setText("Sobrepeso");
                }

                if (objeto.calcular() >= 300.00 || objeto.calcular() <= 340.99) {
                    lblMensaje.setText("Obeso tipo I");
                }

                if (objeto.calcular() >= 350.00 || objeto.calcular() <= 400.00) {
                    lblMensaje.setText("Obeso tipo II");
                }

                if (objeto.calcular() >= 400.00) {
                    lblMensaje.setText("Obesidad tipo III");
                }
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


