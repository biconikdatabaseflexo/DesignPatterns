package com.biconik.inter;

public interface FabricaAbstracta {

    IConexionBD getBD(String motor);
    IConexionREST getREST(String area);
}
