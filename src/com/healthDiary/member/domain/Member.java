package com.healthDiary.member.domain;

import java.util.Date;

public class Member {
	
	private int MemberNum;
	private String MemberName;
	private String phoneNum;
	private String grade;
	private Date regDate;
	private boolean inRoom;
	
	public Member() {}

	public Member(int memberNum, String memberName, String phoneNum, String grade, Date regDate, boolean inRoom) {
		super();
		MemberNum = memberNum;
		MemberName = memberName;
		this.phoneNum = phoneNum;
		this.grade = grade;
		this.regDate = regDate;
		this.inRoom = inRoom;
	}

	public int getMemberNum() {
		return MemberNum;
	}

	public void setMemberNum(int memberNum) {
		MemberNum = memberNum;
	}

	public String getMemberName() {
		return MemberName;
	}

	public void setMemberName(String memberName) {
		MemberName = memberName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public boolean isInRoom() {
		return inRoom;
	}

	public void setInRoom(boolean inRoom) {
		this.inRoom = inRoom;
	}

	
	
	
}
