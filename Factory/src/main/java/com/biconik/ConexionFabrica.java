package com.biconik;

import com.biconik.inter.impl.ConexionMySQL;
import com.biconik.inter.impl.ConexionOracle;
import com.biconik.inter.impl.ConexionPostgreSQL;
import com.biconik.inter.impl.ConexionSQLServer;
import com.biconik.inter.impl.ConexionVacia;
import com.biconik.inter.IConexionBD;


//Aqui solicitará a la fabrica lo que RECIEN VA A FABRICAR
public class ConexionFabrica {

	//Aqui analiza la SOLICITUD A LA FABRICA
	public IConexionBD getConexion(String motor) {
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
}
