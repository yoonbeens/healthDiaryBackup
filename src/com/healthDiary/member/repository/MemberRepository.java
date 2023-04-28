package com.healthDiary.member.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.healthDiary.common.DataBaseConnection;
import com.healthDiary.member.domain.Member;

public class MemberRepository {

	private DataBaseConnection connection = DataBaseConnection.getInstance();
	
	public void newMember(Member memb) {
		System.out.println(memb);
		String sql = "INSERT INTO member "
				+ "(member_number, member_name, phone_number) "
				+ "VALUES(member_seq.NEXTVAL,?,?)";
		
		
		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setString(1, memb.getMemberName());
			pstmt.setString(2, memb.getPhoneNum());
			
			if(pstmt.executeUpdate() == 1) {
				System.out.println("님이 신규 등록되었습니다");
			} else {
				System.out.println("miss you");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
