package br.com.guilherme.utilitario;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	private String serverName = "localhost";
	private String bancoDeDados = "sisprojeto";
	private String usuario = "root";
	private String senha = "1234567";
	private String url="jdbc:mysql://" 	+ serverName + "/" + bancoDeDados;
	private String driver="com.mysql.jdbc.Driver";

	private static Connection conexaoSisProjeto;

	private void conectar() {
		try {
			Class.forName(driver);
			conexaoSisProjeto = DriverManager.getConnection(url,usuario,senha);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private boolean possuiConexao() {
		return conexaoSisProjeto != null;
	}
	private void inicializar() {
		if (!possuiConexao()) {
			conectar();
		}
	}
	public Connection obterConexaoSisProjeto(){
		inicializar();
		return conexaoSisProjeto;
	}

	public void encerrarConexao() {
		try {
			conexaoSisProjeto.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}


