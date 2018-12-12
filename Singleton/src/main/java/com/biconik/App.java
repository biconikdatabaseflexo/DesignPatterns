package com.biconik;

import com.biconik.model.Conexion;

public class App {
	
	public static void main(String args[]) {
		//Instanciacion por constructor prohibido por ser 'private'
		//Conexion c= new Conexion();
		Conexion c= Conexion.getInstancia();
		c.conectar();
		c.desconectar();
		
		boolean rpta= c instanceof Conexion; //Para ver que lo que se retorna
		//es un objeto de la clase Conexion
		System.out.println(rpta);
	}
	
	//Spring Framework gestiona sus beans como Singleton por defecto
}
