package com.ssafy.aop;

import org.aspectj.lang.ProceedingJoinPoint;

//공통 관심사항(부가기능) 저장할 클래스
public class MyAspect {
	//메서드명은 상관 없음: 직관적으로 보여주려고 
	//핵심 기능 실행 전
	public void before() {
		System.out.println("컴퓨터를 부팅한다/커피를 한잔 내린다.");
	}
	
	//핵심 기능 정상 수행 후 
	public void afterReturning(int time) {
		System.out.println("Git Commit을 한다."+ time+"시간 만큼 처리함");
	}
	
	//핵심 기능 예외 발생 후 
	public void afterThrowing(Throwable th) {
		System.out.println("조퇴를 한다.");
		if(th instanceof OuchException) {
			((OuchException)th).handleException();
		}
	}
	
	//핵심 기능 종료 후
	public void after() {
		System.out.println("침대와 한몸이 된다.");
	}
	///////////////////////////////////////////////////////////////////////
	//aroud
	
	public void around(ProceedingJoinPoint pjt) {
//		System.out.println("컴퓨터를 부팅한다/커피를 한잔한다.");
		this.before();
		//핵심관심사항 동작할래 
		try {
			Integer time = (Integer)pjt.proceed();
			afterReturning(time);
		} catch (Throwable e) {
			afterThrowing(e);
		}finally {
			after();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
