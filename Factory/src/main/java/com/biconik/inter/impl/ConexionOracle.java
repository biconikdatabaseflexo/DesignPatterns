package com.biconik.inter.impl;

import com.biconik.inter.IConexion;

public class ConexionOracle implements IConexion{
	
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionOracle() {
		this.host= "localhost";
		this.puerto= "1521";
		this.usuario= "admin";
		this.contrasena= "123";
	}

	public void conectar() {
		//Aqui puede ir el codigo JDBC
		System.out.println("Se ha conectado a Oracle");
	}

	public void desconectar() {
		System.out.println("Se ha desconectado de Oracle");
	}

}
