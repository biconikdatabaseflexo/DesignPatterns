package com.biconik.inter.impl;

import com.biconik.inter.IConexionBD;

public class ConexionVacia implements IConexionBD{

	public void conectar() {
		System.out.println("NO SE ESPECIFICÓ PROVEEDOR");
	}

	public void desconectar() {
		System.out.println("NO SE ESPECIFICÓ PROVEEDOR");
	}

}
