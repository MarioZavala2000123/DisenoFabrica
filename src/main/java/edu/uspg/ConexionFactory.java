package edu.uspg;


import Implements.MYSQL;
import Implements.POSTGRESQL;
import Implements.SQLSERVER;
import iConexion.iConexion;

public class ConexionFactory {
	
	public iConexion getConexion(String motor) {
		if (motor == null ) {
			
		}
		
		if (motor.equalsIgnoreCase("Postgresql")) {
			return new POSTGRESQL();
			
		}if (motor.equalsIgnoreCase("SQL SERVER")) {
			return new SQLSERVER();
			
		}if (motor.equalsIgnoreCase("MySQL")) {
			return new MYSQL();
						
		}
		return new SQLSERVER();
		}
	}