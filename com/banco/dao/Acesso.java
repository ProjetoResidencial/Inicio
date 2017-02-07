package com.banco.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import java.sql.Statement;
public class Acesso {

	public boolean acesso;

	// gerencia conexao
	Connection conn = null;
	// gerencia consulta
	Statement consulta = null;
	// gerencia consulta do tipo select
	ResultSet tabela = null;

	public void Acesso(String login, String senha) {

		try {
			// chamando driver do banco
			Class.forName("com.mysql.jdbc.Driver");
			// conectando com a tabela
			conn = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");
			consulta = (Statement) conn.createStatement();
			tabela = consulta.executeQuery(
					"select login, senha from tbl_usuario where login='" +login+ "'and senha='" + senha + "'");
			if (tabela.next()) {
				JOptionPane.showMessageDialog(null, "Banco com Dados Conectado com Sucesso");
				JOptionPane.showMessageDialog(null, "Usuário e Senha estão Corretos!");
				
				
				
				
				acesso = true;
			} else {
				JOptionPane.showMessageDialog(null, "Usuario ou Senha Incorreto!");
				acesso = false;
			}

		} catch (Exception e) {
			System.out.println("Erro:" + e.getMessage());

		}

	}

	public boolean estaConectado() {
		if (this.conn != null) {
			JOptionPane.showMessageDialog(null, "Banco com Dados Conectado com Sucesso");
			return true;
		} else {
			return false;
		}
	}
}
