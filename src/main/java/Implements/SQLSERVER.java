package Implements;

import iConexion.iConexion;

public class SQLSERVER implements iConexion {

	@Override
	public void conectar() {
		System.out.println("Conexión en SQLSERVER");
		
	}

}
