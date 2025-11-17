package com.ssafy.manager;

import java.util.ArrayList;
import java.util.List;

import com.ssafy.dto.Person;

//싱글톤으로 만들자
public class PersonManager {
	private List<Person> pList = new ArrayList<>();
	private static PersonManager pManager = new PersonManager();
	
	private PersonManager() {
		pList.add(new Person("Yang1", 10, "M", new String[] {"sleep"}));
		pList.add(new Person("Yang2", 12, "M", new String[] {"eat"}));
		pList.add(new Person("Yang3", 13, "M", new String[] {"study"}));
	}
	
	public static PersonManager getManager() {
		return pManager;
	}
	
	public void add(Person p) {
		pList.add(p);
	}
	
	public List<Person> getList(){
		return pList;
	}
	
}
