package com.ssafy.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List03_비교 {
	public static void main(String[] args) {
		List<Object> al = new ArrayList<Object>();
		List<Object> ll = new LinkedList<Object>();
		List<Object> v = new Vector<Object>();

		/*
		 * Vector와 ArrayList 모두 내부적으로 배열로 구현되어 있으나 Vector => 크기 2배씩 증가 ArrayList => 크기
		 * 1.5배씩 증가.
		 */

		test1("순차적 추가 -  ArrayList -", al);
		test1("순차적 추가 - LinkedList -", ll);
		test1("순차적 추가 -   Vector   -", v);
		System.out.println("--------------------------------------------------");
		test2("중간에 추가 -  ArrayList -", al);
		test2("중간에 추가 - LinkedList -", ll);
		test2("중간에 추가 -   Vector   -", v);
		System.out.println("--------------------------------------------------");
		test3("데이터 조회 -  ArrayList -", al);
		test3("데이터 조회 - LinkedList -", ll);
		test3("데이터 조회 -   Vector   -", v);
	}

	public static void test1(String testname, List<Object> list) {
		long start = System.nanoTime(); // 시작 시간
		for (int i = 0; i < 50000; i++) {
			list.add(new String("Hello")); // 뒤에다가 추가
		}
		long end = System.nanoTime(); // 끝 시간
		System.out.printf("%s \t 소요시간: %15d ns. \n", testname, end - start);
	}

	public static void test2(String testname, List<Object> list) {
		long start = System.nanoTime(); // 시작 시간
		for (int i = 0; i < 50000; i++) {
			list.add(0, new String("Hello")); // 맨앞에다가 추가(중간에 추가)
		}
		long end = System.nanoTime(); // 끝 시간
		System.out.printf("%s \t 소요시간: %15d ns. \n", testname, end - start);
	}

	public static void test3(String testname, List<Object> list) {
		long start = System.nanoTime(); // 시작 시간
		// 리스트에 있는 모든 원소 조회
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
		}
		long end = System.nanoTime(); // 끝 시간
		System.out.printf("%s \t 소요시간: %15d ns. \n", testname, end - start);
	}
}
