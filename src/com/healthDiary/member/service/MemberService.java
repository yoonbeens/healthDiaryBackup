package com.healthDiary.member.service;

import java.util.List;
import java.util.Scanner;

import static com.healthDiary.view.AppUI.*;

import com.healthDiary.common.AppService;
import com.healthDiary.member.domain.Member;
import com.healthDiary.member.repository.MemberRepository;

public class MemberService implements AppService {

	private final MemberRepository memberRepository = new MemberRepository();

	@Override
	public void Start() {
		while(true) {
			
			
		}
		
	}
	
	
	private void join() {
		
		System.out.print("이름: ");
		String memberName = inputString();
		
		System.out.print("전화번호: ");
		String phoneNum = inputString();
		
		if(memberName.length() > 5 || memberName.length() < 2) {
			System.out.println("주민등록상의 이름을 입력해주세요");
		} else {
			
			Member member = new Member();
			member.setMemberName(memberName);
		}
		
		System.out.println("'-'을 포함해 전화번호를 입력하세요");
		
		if(phoneNum.length()>14 || phoneNum.length()<14) {
			System.out.println("다시 입력해주세요");
		} 
		

		
	}
	
	private List<Member> searchMember() {
		
		return; 
		
	}
	
	
	
}
