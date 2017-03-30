package com.fsociety.ordinario2;

/**
 * Created by Emmanuel on 29/03/2017.
 */

public class persona {
    private int peso;
    private int estatura;

    public  persona (int peso, int estatura)
    {
        this.peso = peso;
        this.estatura = estatura;
    }
    public int getEstatura() {
        return estatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
