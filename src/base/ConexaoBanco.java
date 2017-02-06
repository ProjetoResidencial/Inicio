package base;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;


	public class ConexaoBanco {
		
		private final String DRIVER = "com.mysql.jdbc.Driver";
		private final String URL = "jdbc:mysql://localhost:3306/dbteste";
		private final String USER = "root";
		private final String PASS = "root";
		
		
		public Connection getConnection(){
			
			try {
				
			    Class.forName(DRIVER);
				return DriverManager.getConnection(URL, USER, PASS);
			
					
			} catch (ClassNotFoundException | SQLException ex) {
	            throw new RuntimeException("Erro na Conexão: " ,ex);
	             }
			
			}
		
		public static void closeConnection(Connection con){
			try{
					if (con !=null){
						con.close();
				}
				} catch (SQLException ex) {
					 throw new RuntimeException("Fechando Conexão" ,ex);
					
					}
				}
		
		public static void closeConnection(Connection con,java.sql.PreparedStatement  stmt){
			closeConnection(con);
			
			try{
				
				if (stmt != null){
					stmt.close();
				}
				} catch (SQLException ex) {
					 throw new RuntimeException("Fechando Conexão" ,ex);
					
					}
				}
		
		public static void closeConnection(Connection con,java.sql.PreparedStatement stmt, ResultSet rs){
			closeConnection(con, stmt);
			
			try{
				
				if (rs != null){
					rs.close();
				}
				} catch (SQLException ex) {
					 throw new RuntimeException("Fechando Conexão" ,ex);
					
					}
				}
			 
			 
		

	
}


