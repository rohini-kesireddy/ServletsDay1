package com.ltts.Dao;

 

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ltts.connection.*;
import com.ltts.model.*;

public class AuctionDao {
	
	public boolean insertAuction(Auction p) throws Exception {
		//fill your code
		Connection mc=DatabaseConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into auction values(?,?,?,?)");
		ps.setInt(1, p. getAuc_id());
		ps.setInt(2, p. getPlayer_id());
		ps.setInt(3, p.getTeam_id());
		ps.setInt(4, p.getAmount());
		
		
		return ps.execute();
	}
}
