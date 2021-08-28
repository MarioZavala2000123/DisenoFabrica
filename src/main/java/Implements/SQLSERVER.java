package Implements;

import iConexion.iConexion;

public class SQLSERVER implements iConexion {
	
	private String host;
	private String puerto;
	private String usuario;
	private String contraseña;
	
	
	public void ConexionSQLServer() {
		this.host = "localhost";
		this.puerto = "1433";
		this.usuario = "SQLServer";
		this.contraseña = "2609001";
		
	}

	@Override
	public void conectar() {
		System.out.println("Conexión en SQLSERVER");
		
	}

}
