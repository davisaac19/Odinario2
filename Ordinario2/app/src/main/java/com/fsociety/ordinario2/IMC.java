package com.fsociety.ordinario2;

/**
 * Created by Emmanuel on 29/03/2017.
 */

public class IMC {
    private int peso;
    private int estatura;

    public IMC (int peso, int estatura)
    {
        this.peso = peso;
        this.estatura = estatura;
    }

    public int calcular ()
    {
        return  (peso / estatura);
    }
}
