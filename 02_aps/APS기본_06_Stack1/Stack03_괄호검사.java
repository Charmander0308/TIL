import java.util.Stack;

public class Stack03_괄호검사 {
	
	//소괄호만 있어! 간단한 문제로 만들어보자
	public static void main(String[] args) {
		//괄호검사
		//1. 여는괄호와 닫는괄호의 개수는 동일해야한다.
		//2. 여는괄호는 닫는괄호 보다 먼저 나와야 한다.
		//3. 괄호는 포함관계여야 한다. (소괄호만 있으니까 이번 경우는 굳이?)
		
		
		String str = "())()(())";
		
		//스택에는 항상 여는괄호만 들어간다. (닫는괄호는 들어가지 않아)
		Stack<Character> stack = new Stack<>();
		boolean isOk = true;// 정상인지 아닌지를 쳌하기 위함
		for(int i = 0; i<str.length(); i++) {
			//1. 여는괄호 넣어!
			if(str.charAt(i) == '(') {
				stack.push(str.charAt(i));
//				stack.push('(');//해당 문제 한정이라... 조심스럽다.
			}
			//2. 닫는괄호 확인 필쑤
			else {
				//공백쳌
				if(stack.isEmpty()) {
					isOk = false;
					break;
				}else {
					char c = stack.pop(); //검사 실시
//					if(c == ')')...
					//지금은 특수한 상황이므로 하지 않아도 되지만..
					//오후에 여러분들이 풀 문제에서는 해야됨... ㅎ
				}
			}
		}//검사 for문
		
		//괄호검사 끝
		if(isOk && stack.isEmpty()) {
			System.out.println("검사 결과 이상 무!");
		}else {
			System.out.println("이슈 발생 ㅠ");
		}
		
		if(!isOk || !stack.isEmpty()) {
			System.out.println("이슈 발생 ㅠ");
		}else {
			System.out.println("검사 결과 이상 무!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
