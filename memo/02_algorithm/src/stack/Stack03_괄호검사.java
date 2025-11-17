package stack;

import java.util.Stack;

public class Stack03_괄호검사 {
	//소괄호만 있어! 간단한 문제로 만들어보자
	public static void main(String[] args) {
		//괄호검사
		//1. 여는 괄호와 닫는 괄호의 개수는 동일해야 한다.
		//2. 여는 골화는 닫는괄호보다 먼저 나와야한다.
		//3. 괄호는 포함관계여야 한다. (소괄호만 있으니까 이번경우는 pass)
		
		String str = "()()()(())";
		Stack<Character> stack = new Stack<>();
		boolean isOk = true; //정상인지 아닌지를 check하기 위함
		for(int i = 0; i < str.length(); i++) {
			//1. 여는 괄호 넣어!
			if(str.charAt(i) == '(') {
				stack.push(str.charAt(i));
//				stack.push('('); //해당 문제 한정이라.. 조심스럽다..
			} 
			//2. 닫는 괄호 확인 필수
			else {
				//공백 체크
				if(stack.isEmpty()) {
					isOk = false;
					break;
				} else {
					char c = stack.pop();	//검사실시
//					if(c == ')')...		//지금은 특수한 상황이라 괄호 종류검사는 안해도되지만 평시에는 해야함
				}
			}
		}//검사 for문
		
		//괄호 검사 끝
		if(isOk && stack.isEmpty()) {
			System.out.println("검사 결과 이상 무!");
		} else {
			System.out.println("이슈 발생 ㅠ");
		}
		
		if(!isOk||!stack.isEmpty()) {
			System.out.println("이슈발생");
		} else {
			System.out.println("검사 결과 이상 무");
		}
		
	}

}
