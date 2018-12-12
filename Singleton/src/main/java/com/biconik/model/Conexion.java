package com.biconik.model;

//Aqui lograremos que todos los usuarios solo usen una única instancia
public class Conexion {
	
	//Declaracion
	private static Conexion instancia;
	
	//Para evitar instancia mediante operador new(), asi evitamos crear más
	private Conexion() {} //'Es private'
	
	//Para obtener la instancia unicamente por este metodo
	//Notese la palabra reservada 'static' hace posible su acceso sin instanciar
	//Y comprueba que como máximo exista solo 1 instancia, retornandola si ya hay
	public static Conexion getInstancia() {
		if(instancia==null) {
			instancia= new Conexion();
		}
		return instancia;
	}
	
	//Metodo de prueba
	public void conectar() {
		System.out.println("Conexion exitosa a la BD");
	}
	//Metodo de prueba
	public void desconectar() {
		System.out.println("Desconectado de la BD");
	}
}
