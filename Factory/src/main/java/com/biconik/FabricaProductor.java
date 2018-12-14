package com.biconik;

import com.biconik.inter.FabricaAbstracta;

public class FabricaProductor {
    
    public static FabricaAbstracta getFactory(String tipoFabrica){
        if(tipoFabrica.equalsIgnoreCase("BD"))
            return new ConexionBDFabrica();
        else if(tipoFabrica.equalsIgnoreCase("REST"))
            return new ConexionRESTFabrica();
        else
            return null;
    }
}
