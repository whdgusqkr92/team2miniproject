package com.kkpjj.sysostory.model.dto;

public class MemberDTO implements java.io.Serializable{
	
	private int userNo;
	private String userGrade;
	private String userId;
	private String userPwd;
	private String userName;
	private String email;
	private char userStatus;
	
	public MemberDTO() {}

	public MemberDTO(int userNo, String userGrade, String userId, String userPwd, String userName, String email,
			char userStatus) {
		super();
		this.userNo = userNo;
		this.userGrade = userGrade;
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.email = email;
		this.userStatus = userStatus;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserGrade() {
		return userGrade;
	}

	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(char userStatus) {
		this.userStatus = userStatus;
	}

	@Override
	public String toString() {
		return "MemberDTO [userNo=" + userNo + ", userGrade=" + userGrade + ", userId=" + userId + ", userPwd="
				+ userPwd + ", userName=" + userName + ", email=" + email + ", userStatus=" + userStatus + "]";
	}
	
}
