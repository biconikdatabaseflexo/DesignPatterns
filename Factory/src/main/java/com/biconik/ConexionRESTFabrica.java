package com.biconik;

import com.biconik.inter.FabricaAbstracta;
import com.biconik.inter.IConexionBD;
import com.biconik.inter.IConexionREST;
import com.biconik.inter.impl.ConexionRESTCompras;
import com.biconik.inter.impl.ConexionRESTNoArea;
import com.biconik.inter.impl.ConexionRESTVentas;

public class ConexionRESTFabrica implements FabricaAbstracta {

    public IConexionBD getBD(String motor) {
        return null;
    }

    public IConexionREST getREST(String area) {
        if(area==null){
            return new ConexionRESTNoArea();
        }
        if(area.equalsIgnoreCase("COMPRAS")){
            return new ConexionRESTCompras();
        }
        else if(area.equalsIgnoreCase("VENTAS")){
            return new ConexionRESTVentas();
        }
        
        return new ConexionRESTNoArea();
    }

}
