import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Stack06_계산기실습 {
	public static void main(String[] args) {
		//문자열로된 수식 -> 입력 받은 수식 
		String infix = "(6+5*(2-8)/2)";
		
		//연산자 우선순위 (Map을 이용해보자) -> 스택 내부에서 판단!
		// * / : 2
		// + - : 1
		// (   : 0
		Map<Character, Integer> priority = new HashMap<>();
		priority.put('*', 2);
		priority.put('/', 2);
		priority.put('+', 1);
		priority.put('-', 1);
		priority.put('(', 0);
		
		
		StringBuilder postfix = new StringBuilder();
		//연산자를 담는 스택
		Stack<Character> op = new Stack<>();
		
		//글자를 하나씩 읽어오자! (피연산자는 한자리수 임을 보장하겠다)
		for(int i = 0 ; i<infix.length(); i++) {
			char tmp = infix.charAt(i);
			//1. 피연산자라면 출력
			if(tmp >= '0' && tmp<='9') {
				postfix.append(tmp);
			}//2. 연산자라면 -> 고민해보자
			//2-1. '(' 여는 소괄호 라면
			else if(tmp == '(') {
				//겉바 -> 바로 추가
				op.push(tmp);
			}
			//2-2. ')' 닫는 소괄호 라면 -> 여는 소괄호 만날 때까지 pop
			else if(tmp == ')') {
				while(op.peek() != '(') {
					postfix.append(op.pop());
				}
				op.pop(); //스택의 top은 '('를 가리키고 있음 (버리기)
			}
			//2-3 연산자라면 * / + -
			else {
				//공백 상태라면....
				if(op.isEmpty()) {
					op.push(tmp);
				}else {
					//연산자 우선순위를 비교해서 처리한다!(마숙)
					while(priority.get(op.peek()) >= priority.get(infix.charAt(i)) && !op.isEmpty()) {
						postfix.append(op.pop());
					}
					op.push(infix.charAt(i));
				}
			}
		}//하나씩 읽는 for문
		while(!op.isEmpty())
			postfix.append(op.pop());
		
		System.out.println(postfix);
		//중위->후위바꿔서 계산
		
		//문자열로 할까? 고민
		Stack<Integer> calc = new Stack<>(); //숫자를 담을 스택
		for(int i = 0; i<postfix.length(); i++	) {
			//피연산자라면
			if(postfix.charAt(i) >= '0' && postfix.charAt(i) <= '9') {
				//숫자로 바꿔서 넣자!
				calc.push(postfix.charAt(i)-'0');
			}
			//연산자라면
			else {
				//꺼내는 순서 매우 중요
				int B = calc.pop();
				int A = calc.pop();
				
				switch(postfix.charAt(i)) {
				case '+':
					calc.push(A+B);
					break;
				case '-':
					calc.push(A-B);
					break;
				case '*':
					calc.push(A*B);
					break;
				case '/':
					calc.push(A/B);
					break;
				}
			}
		
		}//후위 계산 for문
		
		System.out.println(calc.pop());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// main
}
