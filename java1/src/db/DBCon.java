package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DBCon {
	
	private String driver = "org.mariadb.jdbc.Driver";
	private String url = "jdbc:mariadb://localhost:3306/study";
	private String id = "root";
	private String pwd = "gp02fu3369"; 
	private Connection con;
	private PreparedStatement ps;
	
	public DBCon() {
		try {
			Class.forName(driver);  //현재  Class를 사용시 driver를 사용하겠다라는 의미
			dbConnecte();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	private void dbConnecte()  throws SQLException{
		con = DriverManager.getConnection(url, id, pwd);
	}
	
	public List<HashMap<String, String>> getListFromTable(String sql){
		try {
			ps = con.prepareStatement(sql);  //sql 실행하는 함수
			ResultSet rs = ps.executeQuery();  //ResultSet에는 colum명인 metadata까지 가지고 있음, sql의 결과값을 적기 위해 		
			ResultSetMetaData rsmd = rs.getMetaData();
			int maxNum = rsmd.getColumnCount();
			List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
			while (rs.next()) {
				HashMap<String, String> hm = new HashMap<String, String>();
				for(int i = 0; i <= maxNum; i++) {
					String colName =  rsmd.getColumnLabel(i);
					hm.put(colName, rs.getString(colName));
				}
				list.add(hm);
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public void printListFromTable(String sql){
		 List<HashMap<String, String>> list = getListFromTable(sql);
		 if(list != null) {
			 for (HashMap<String, String> hm : list) {
				 System.out.println(hm);
			 }
		 }
	}
	
	public static void main(String[] args) throws SQLException {
		DBCon dbcon = new DBCon();
		dbcon.dbConnecte();
		String sql = "select * from user_info";
		dbcon.getListFromTable(sql);
		dbcon.printListFromTable(sql);
		
	}
}
