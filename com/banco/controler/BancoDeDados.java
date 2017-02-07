package com.banco.controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;


public class BancoDeDados {

	//public boolean acesso;
	
	// gerencia conexao
	private Connection connection = null;
	// gerencia consulta
	private Statement  statement = null;
	// gerencia consulta do tipo select
	private ResultSet resulset = null;
	
	public void conectar(){
		
		String servidor = "jdbc:mysql://localhost/login";
		String usuario = "root";
		String senha =  "";
		String driver = "com.mysql.jdbc.Driver";
		
		
		try {
			Class.forName(driver);

			this.connection = DriverManager.getConnection(servidor, usuario, senha);

			this.statement = this.connection.createStatement();
		}
			catch (Exception e) {
			System.out.println("Erro:" + e.getMessage());
			
			}

		}
	public boolean estaConectado(){
		if(this.connection !=null){
			return true;
		}else{
			return false;
		}
	}
	//public void listarContatos(){
		//try{
			
			
		//}
	//}
}
	

	
	
	
	
