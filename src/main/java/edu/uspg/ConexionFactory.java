package edu.uspg;

import iConexion.iConexion;

public abstract class ConexionFactory {
	
	public abstract iConexion getiConexion(String concexion);

}
