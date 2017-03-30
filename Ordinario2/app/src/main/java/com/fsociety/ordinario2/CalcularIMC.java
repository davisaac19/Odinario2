package com.fsociety.ordinario2;

/**
 * Created by Emmanuel on 29/03/2017.
 */

public class CalcularIMC {
    private float peso;
    private float estatura;

    public CalcularIMC (float peso, float estatura)
    {
        this.peso = peso;
        this.estatura = estatura;
    }

    public float calcular ()
    {
        return  (((estatura) *(estatura)) / peso);
    }
}
