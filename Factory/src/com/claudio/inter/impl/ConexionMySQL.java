package com.claudio.inter.impl;

import com.claudio.inter.IConexion;

public class ConexionMySQL implements IConexion{
	
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionMySQL() {
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "root";
		this.contrasena = "123";
	}
	
	@Override
	public void conectar() {
		//Aqui puede ir coddigo JDBC
		System.out.println("Se conectů a MySQL");
	}
	
	@Override
	public void desconectar() {
		//Aqui puede ir coddigo JDBC
		System.out.println("Se desconectů a MySQL");
	}
}
