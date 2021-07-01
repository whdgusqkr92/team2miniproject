package com.kkpjj.sysostory.view;

public class MemberResultView {

	public void success() {
		System.out.println("회원가입에 성공하셨습니다.");
		
	}
	
	public void loginSuccess() {
		System.out.println("로그인에 성공하셨습니다.");
	}
	
	public void loginfail() {
		System.out.println("로그인에 실패하셨습니다.");
	}
	
	public void fail() {
		System.out.println("제대로된 정보를 입력해주세요.");
		
	}

}
