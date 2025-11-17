package di_04_의존성주입;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Programmer p = new Programmer();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			p.setComputer(ComputerFactory.getComputer(sc.next()));
			p.coding();
		}
	}
}
