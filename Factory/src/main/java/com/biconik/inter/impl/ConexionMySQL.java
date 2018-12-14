package com.biconik.inter.impl;

import com.biconik.inter.IConexionBD;

public class ConexionMySQL implements IConexionBD{

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionMySQL() {
		this.host= "localhost";
		this.puerto= "3306";
		this.usuario= "root";
		this.contrasena= "123";
	}
	
	public void conectar() {
		//Aqui puede ir el codigo JDBC
		System.out.println("Se ha conectado a MySQL");
	}

	public void desconectar() {
		System.out.println("Se ha desconectado de MySQL");
	}

	
}
