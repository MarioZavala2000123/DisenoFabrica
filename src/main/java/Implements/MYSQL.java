package Implements;

import iConexion.iConexion;

public class MYSQL implements iConexion {
	
	private String host;
	private String puerto;
	private String usuario;
	private String contraseña;
	
	
	public void ConexionMysQL() {
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "MysQl";
		this.contraseña = "2609001";
		
	}

	@Override
	public void conectar() {
		System.out.println("Conexión en MYSQL");
		
	}

}
