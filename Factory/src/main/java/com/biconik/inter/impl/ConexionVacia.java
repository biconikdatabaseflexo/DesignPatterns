package com.biconik.inter.impl;

import com.biconik.inter.IConexion;

public class ConexionVacia implements IConexion{

	public void conectar() {
		System.out.println("NO SE ESPECIFICÓ PROVEEDOR");
	}

	public void desconectar() {
		System.out.println("NO SE ESPECIFICÓ PROVEEDOR");
	}

}
