package com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta.inter.impl;

import com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta.inter.IConexionBD;

public class ConexionOracle implements IConexionBD {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionOracle() {
		this.host = "localhost";
		this.puerto = "1521";
		this.usuario = "admin";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		// Aqui puede ir c�digo JDBC
		System.out.println("Se conect� a Oracle");

	}

	@Override
	public void desconectar() {
		System.out.println("Se desconect� de Oracle");
	}

	@Override
	public String toString() {
		return "ConexionOracle [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}

}
