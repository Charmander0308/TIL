package com.ssafy.proxy01;

import java.util.Random;

public class SSAFY {
	//필드는 생략!
	
	//주된 일상
	public void coding() {
		System.out.println("컴퓨터를 부팅한다/커피를 한 잔 내린다.");		//이전에 수행할 기능
		
		try {
			System.out.println("열심히 공부를 한다.");	//핵심기능
			if(new Random().nextBoolean()){
				throw new OuchException();
			}
			System.out.println("Git Commit을 한다."); 	//정상적으로 종료가 되었다.
		} catch (OuchException e) {
			System.out.println("조퇴를 한다.");
			e.handleException();	//비정상적 종료가 되었을때
		} finally {
			System.out.println("집에 가서 침대와 한 몸이 된다."); 	//모든 게 끝났을 때
		}
		
		
	}
	
	
}
