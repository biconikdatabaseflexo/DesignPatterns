package com.biconik.inter;

//Aqui lo que hace es ser una FABRICA DE FABRICAS
//sabiendo a que FABRICA va a llamar
public interface FabricaAbstracta {

    IConexionBD getBD(String motor);
    IConexionREST getREST(String area);
}
