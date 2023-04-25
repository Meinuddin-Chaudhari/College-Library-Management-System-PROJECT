package in.ineuron.library.util;
import org.apache.commons.dbcp.BasicDataSource;

import java.sql.*;

public class DataSourseUtil {
	
	public static Connection getConnection() {
		Connection con=null;
		try {
			BasicDataSource myds=new BasicDataSource();
			myds.setDriverClassName("com.mysql.cj.jdbc.Driver");
			myds.setUrl("jdbc:mysql://localhost:3306/librarydatabase");
			myds.setUsername("root");
			myds.setPassword("admin");
			myds.setInitialSize(10);
			myds.setMaxActive(100);
			
			con=myds.getConnection();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return con;
	}
	
	public static void cleanUp(ResultSet rs,PreparedStatement ps,Connection con) {
		try {
			if(rs!=null) {
				rs.close();
			}
			if(ps!=null) {
				ps.close();
			}
			if(con!=null) {
				con.close();
			}
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
	}
	
	public static void cleanUp(PreparedStatement ps,Connection con) {
		try {
			if(ps!=null) {
				ps.close();
			}
			if(con!=null) {
				con.close();
			}
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
	}

}
