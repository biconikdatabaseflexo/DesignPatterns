package com.biconik;

import com.biconik.inter.FabricaAbstracta;
import com.biconik.inter.IConexionBD;
import com.biconik.inter.IConexionREST;

public class App {

    public static void main(String[] args) {

        FabricaAbstracta fabricaBD= FabricaProductor.getFactory("BD");
        
        IConexionBD cx1 = fabricaBD.getBD("Oracle");
        cx1.conectar();
        cx1.desconectar();

        IConexionBD cx2 = fabricaBD.getBD("MYSQL");
        cx2.conectar();
        cx2.desconectar();

        FabricaAbstracta fabricaREST= FabricaProductor.getFactory("REST");
        
        IConexionREST rx1= fabricaREST.getREST("Compras");
        rx1.leerURL("amazon.com/compras");
        
        IConexionREST rx2= fabricaREST.getREST("Ventas");
        rx2.leerURL("ebay.com/productos");
    }
}
