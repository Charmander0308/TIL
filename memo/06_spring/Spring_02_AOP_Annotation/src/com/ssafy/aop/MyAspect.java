package com.ssafy.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.stereotype.Component;

//공통 관심사항(부가기능) 저장할 클래스
@Component
@Aspect
public class MyAspect {
	
	//포인트컷 : 여러개의 조인 포인트들 중 내가 들어갈 곳을 결정하는 조건
	@Pointcut("execution(* com.ssafy.aop.*.coding())")
	public void mypt() {
		//메서드의 내용은 작성하지 않는다.
		//메서드 명 -> id
	}
	
	
	//메서드명은 상관 없음 : 직관적으로 보여주려고 이래 함
	//핵심 기능 실행 전
	@Before("mypt()")
	public void before() {
		System.out.println("컴퓨터를 부팅한다/커피를 한 잔 내린다.");
	}
	
	//핵심 기능 정상 수행 후
	@AfterReturning(value="mypt()", returning="time")
	public void afterReturning(int time) {
		System.out.println("Git Commit을 한다." + time + "시간 만큼 처리함");
	}
	
	//핵심 기능 예외 발생 후
	@AfterThrowing(value="mypt()", throwing="th")
	public void afterThrowing(Throwable th) {
		System.out.println("조퇴를 한다.");
		if(th instanceof OuchException) {
			((OuchException)th).handleException();
		}
	}
	
	//핵심 기능 종료 후
	@After("mypt()")
	public void after() {
		System.out.println("침대와 한 몸이 된다.");
	}
	
	/////////////////////////////////////////////////////////////////////////////
	//around
	@Around("mypt()")
	public void around(MethodInvocationProceedingJoinPoint pjt){
//		System.out.println("컴퓨터를 부팅한다/커피를 한 잔 한다.");
		before();
		//핵심관심사항 동작할래
		try {
			Integer time = (Integer)pjt.proceed();
			afterReturning(time);
		} catch (Throwable e) {
			afterThrowing(e);
		} finally {
			after();
		}
	}
	
	
}
