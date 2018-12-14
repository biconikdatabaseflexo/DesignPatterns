package com.biconik;

<<<<<<< HEAD:Factory/src/main/java/com/biconik/ConexionBDFabrica.java
import com.biconik.inter.FabricaAbstracta;
import com.biconik.inter.IConexionBD;
import com.biconik.inter.IConexionREST;
=======
>>>>>>> refs/remotes/origin/master:Factory/src/main/java/com/biconik/ConexionFabrica.java
import com.biconik.inter.impl.ConexionMySQL;
import com.biconik.inter.impl.ConexionOracle;
import com.biconik.inter.impl.ConexionPostgreSQL;
import com.biconik.inter.impl.ConexionSQLServer;
import com.biconik.inter.impl.ConexionVacia;
import com.biconik.inter.IConexionBD;


//Aqui solicitará a la fabrica lo que RECIEN VA A FABRICAR
public class ConexionBDFabrica implements FabricaAbstracta{

	//Aqui analiza la SOLICITUD A LA FABRICA
<<<<<<< HEAD:Factory/src/main/java/com/biconik/ConexionBDFabrica.java
	public IConexionBD getBD(String motor) {
=======
	public IConexionBD getConexion(String motor) {
>>>>>>> refs/remotes/origin/master:Factory/src/main/java/com/biconik/ConexionFabrica.java
		if(motor==null) {
			return new ConexionVacia();
		}
		if(motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL();
		}else if(motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		}else if(motor.equalsIgnoreCase("POSTGRE")) {
			return new ConexionPostgreSQL();
		}else if(motor.equalsIgnoreCase("SQL")) {
			return new ConexionSQLServer();
		}	
		return new ConexionVacia();
	}
        
        public IConexionREST getREST(String area){
            return null;
        }
}
