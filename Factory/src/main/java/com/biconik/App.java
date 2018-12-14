package com.biconik;

<<<<<<< HEAD
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
=======
import com.biconik.inter.IConexionBD;

public class App {
	public static void main(String[] args) {
		ConexionFabrica fabrica= new ConexionFabrica();
		
		IConexionBD cx1= fabrica.getConexion("ORACLE");
		cx1.conectar();
		cx1.desconectar();
		
		IConexionBD cx2= fabrica.getConexion("MYSQL");
		cx2.conectar();
		cx2.desconectar();
		
		IConexionBD cx3= fabrica.getConexion("H2");
		cx3.conectar();
		cx3.desconectar();
	}
>>>>>>> refs/remotes/origin/master
}
