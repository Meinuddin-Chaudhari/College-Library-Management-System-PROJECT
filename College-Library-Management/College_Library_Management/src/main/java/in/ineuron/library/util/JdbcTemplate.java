package in.ineuron.library.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import in.ineuron.library.util.DataSourseUtil;
import in.ineuron.library.util.RowMapper;

public class JdbcTemplate {
	
	public static int update(String SQL,Object... params) {
		//System.out.println("update");
		//update() method has to used for doing updateable(I,U,D) operations with any table 
		Connection con=null;
		PreparedStatement ps=null; 
		int x=0;
		
		try {
			con=DataSourseUtil.getConnection();
			ps=con.prepareStatement(SQL);
			
			for(int i=1;i<=params.length;i++) {
				ps.setObject(i, params[i-1]);
				//System.out.println("Setting param");
			}
			x=ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DataSourseUtil.cleanUp(ps, con);
		}
		return x;
	}
	
	//ANy select operation with any table which return 0 or 1 record
	public static Object queryForObject(String SQL,RowMapper rowMapper , Object... params) {
		//System.out.println("JDBC-Template queryForObject");
		Connection con=null;
		PreparedStatement ps=null; 
		ResultSet rs=null;
		Object obj=null;
		
		try {
			con=DataSourseUtil.getConnection();
			ps=con.prepareStatement(SQL);
			
			for(int i=1;i<=params.length;i++) {
				ps.setObject(i, params[i-1]);
			}
			rs=ps.executeQuery();
			
			if(rs.next()) {
				obj=rowMapper.mapRow(rs);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DataSourseUtil.cleanUp(rs,ps, con);
		}
		
		return obj;
	}
	
	public static int queryForInteger(String SQL,Object... params) {
		//System.out.println("JDBC-Template queryForInteger");
		Connection con=null;
		PreparedStatement ps=null; 
		ResultSet rs=null;
		int x=-1;
		
		try {
			con=DataSourseUtil.getConnection();
			ps=con.prepareStatement(SQL);
			
			for(int i=1;i<=params.length;i++) {
				ps.setObject(i, params[i-1]);
			}
			rs=ps.executeQuery();
			if(rs.next()) {
				x=rs.getInt(1);
			}
			//System.out.println("JDBC-Template queryForInteger rs.getInt(1) "+rs.getInt(1));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DataSourseUtil.cleanUp(rs,ps, con);
		}
		
		return x;
	}
	
	public static List<Integer> queryForIntegerList(String SQL, Object... params) {
		//System.out.println("JDBC-Template queryForIntegerList");
		Connection con=null;
		PreparedStatement ps=null; 
		ResultSet rs=null;
		List<Integer> requestedBookIdList=new ArrayList();
		
		try {
			con=DataSourseUtil.getConnection();
			ps=con.prepareStatement(SQL);
			
			for(int i=1;i<=params.length;i++) {
				ps.setObject(i, params[i-1]);
			}
			rs=ps.executeQuery();
			
			while(rs.next()) {
				//System.out.println("JDBC-Template queryForIntegerList rs.getInt(1) "+rs.getInt(1));
				requestedBookIdList.add(rs.getInt(1));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DataSourseUtil.cleanUp(rs,ps, con);
		}
		return requestedBookIdList;
	}
	
	//ANy select operation with any table which return 0 or more record
		public static List queryForList(String SQL,RowMapper rowMapper , Object... params) {
			//System.out.println("JDBC-Template queryForList");
			Connection con=null;
			PreparedStatement ps=null; 
			ResultSet rs=null;
			List mylist=new ArrayList();
			
			try {
				con=DataSourseUtil.getConnection();
				ps=con.prepareStatement(SQL);
				
				for(int i=1;i<=params.length;i++) {
					ps.setObject(i, params[i-1]);
				}
				rs=ps.executeQuery();
				
				while(rs.next()) {
					Object obj=rowMapper.mapRow(rs);
					mylist.add(obj);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
				DataSourseUtil.cleanUp(rs,ps, con);
			}
			
			return mylist;
		}
		
		
		public static List queryForObjectList(String SQL,RowMapper rowMapper) {
			//System.out.println("JDBC-Template queryForList");
			Connection con=null;
			PreparedStatement ps=null; 
			ResultSet rs=null;
			List mylist=new ArrayList();
			
			try {
				con=DataSourseUtil.getConnection();
				ps=con.prepareStatement(SQL);
				rs=ps.executeQuery();
				
				while(rs.next()) {
					Object obj=rowMapper.mapRow(rs);
					mylist.add(obj);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
				DataSourseUtil.cleanUp(rs,ps, con);
			}
			
			return mylist;
		}
}
