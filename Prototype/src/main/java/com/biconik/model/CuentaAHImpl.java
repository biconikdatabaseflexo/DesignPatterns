package com.biconik.model;

import com.biconik.inter.ICuenta;

public class CuentaAHImpl implements ICuenta {
    
    //Sirve para clonar informacion en lugar de instanciar y asignar los mismos valores

    private String tipo;
    private double monto;

    public CuentaAHImpl() {
        this.tipo = "AHORRO";
    }

    @Override
    public ICuenta clonar() {
        CuentaAHImpl cuenta = null;

        try {
            cuenta = (CuentaAHImpl) clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("No se pudo clonar");
        }
        return cuenta;
    }

    @Override
    public String toString() {
        return "CuentaAHImpl [tipo= " + tipo + ", monto= " + monto + "]";
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

}
