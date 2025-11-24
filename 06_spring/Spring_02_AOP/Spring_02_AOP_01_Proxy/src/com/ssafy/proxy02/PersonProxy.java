package com.ssafy.proxy02;

import java.util.Random;

public class PersonProxy implements Person{
	
	private Person person; //때로는 프로그래머, 때로는 SSAFY
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	@Override
	public void coding() {
		System.out.println("컴퓨터를 부팅한다/커피를 한잔 내린다."); // 이전에 수행할 기능
		try {
			person.coding();
			if(new Random().nextBoolean()) {
				throw new OuchException();
			}
			
			System.out.println("Git Commit을 한다.");// 정상적으로 종료가 되었다.
			
		} catch (OuchException e) {
			System.out.println("조퇴를 한다.");
			e.handleException(); //비정상적 종료가 되었을때
		} finally {
			System.out.println("집에가서 침대와 한몸이 된다."); // 모든게 끝났을 때
		}
		
	}

}
