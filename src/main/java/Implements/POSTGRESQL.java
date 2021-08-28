package Implements;

import iConexion.iConexion;

public class POSTGRESQL implements iConexion{
	
	private String host;
	private String puerto;
	private String usuario;
	private String contraseña;
	
	
	public void ConexionPostgresql() {
		this.host = "localhost";
		this.puerto = "5432";
		this.usuario = "Postgresql";
		this.contraseña = "2609001";
		
	}

	@Override
	public void conectar() {
		System.out.println("Conexión en POSTGRESQL");
		
	}

}
