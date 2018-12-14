package com.biconik.inter.impl;

import com.biconik.inter.IConexionREST;

public class ConexionRESTCompras implements IConexionREST {

    public void leerURL(String url) {
        System.out.println("Conectandose a " + url);
    }

}
