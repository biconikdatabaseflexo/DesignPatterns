package com.biconik.inter.impl;

import com.biconik.inter.IConexion;

public class ConexionSQLServer implements IConexion{

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionSQLServer() {
		this.host= "localhost";
		this.puerto= "1433";
		this.usuario= "postgres";
		this.contrasena= "123";
	}
	
	public void conectar() {
		//Aqui puede ir el codigo JDBC
		System.out.println("Se ha conectado a SQLServer");
	}

	public void desconectar() {
		System.out.println("Se ha desconectado de SQLServer");
	}
}
