package Implements;

import iConexion.iConexion;

public class POSTGRESQL implements iConexion{

	@Override
	public void conectar() {
		System.out.println("Conexión en POSTGRESQL");
		
	}

}
