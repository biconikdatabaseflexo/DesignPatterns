package com.biconik.inter.impl;

import com.biconik.inter.IConexionBD;

public class ConexionPostgreSQL implements IConexionBD{

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionPostgreSQL() {
		this.host= "localhost";
		this.puerto= "5433";
		this.usuario= "postgres";
		this.contrasena= "123";
	}
	
	public void conectar() {
		//Aqui puede ir el codigo JDBC
		System.out.println("Se ha conectado a PostgreSQL");
	}

	public void desconectar() {
		System.out.println("Se ha desconectado de PostgreSQL");
	}
}
