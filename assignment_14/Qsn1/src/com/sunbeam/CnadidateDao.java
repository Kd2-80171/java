package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CnadidateDao implements AutoCloseable {
	private Connection con;
	public CnadidateDao() throws SQLException {
		con = DbUtil.getConnection();
	}
	@Override
	public void close() throws Exception {
		if (con != null)
			con.close();
		
	}
	
	public int insertbyID (int id) throws SQLException{
		String sql = "insert into candidates where id=?";
		
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
			
		}
		
	}
	public int updatebyID (Candidate cd) throws SQLException{
		String sql = "update candidates set name=? , set party = ?  where id=?";
		
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setString(1, cd.getName());
			stmt.setString(1, cd.getParty());
			stmt.setInt(1, cd.getId());
			int cnt = stmt.executeUpdate();
			return cnt;
			
		}
		
	}
	
	public List<Candidate> getPartyWiseVotes() throws SQLException {
		
		List <Candidate> list = new ArrayList<>();
		String sql = "select party , sum(votes) total from candidates group by party";
		
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			try(ResultSet rs = stmt.executeQuery()){
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String  party = rs.getString("party");
					int votes = rs.getInt("total");
					
					Candidate c = new Candidate(id ,name, party ,votes);
					list.add(c);
				}
			}
		}
		return list;
		
	}
	
	

}
