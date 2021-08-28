package edu.uspg;

import iConexion.iConexion;

public class FactoryPatternConexion extends ConexionFactory {

	public static void main(String[] args) {
		ConexionFactory Fabrica = new ConexionFactory();
		
		iConexion Postgresql = Fabrica.getConexion("Postgresql");
		System.out.println();
		System.out.println("1.  Conexion base de datos a Postgresql");
		System.out.println();
		System.out.println("----------------------");
		Postgresql.conectar();
		System.out.println("----------------------");
	
		
		iConexion SQL = Fabrica.getConexion("SQL");
		System.out.println();
		System.out.println("2.  Conexion a la base de datos de SQL Server");
		System.out.println();
		System.out.println("----------------------");
		SQL.conectar();
		System.out.println("----------------------");

		iConexion MysQL = Fabrica.getConexion("MysQL");
		System.out.println();
		System.out.println("3.  Conexion a la base de datos de MysQL Server");
		System.out.println();
		System.out.println("----------------------");
		MysQL.conectar();
		System.out.println("----------------------");
		
	}

}
