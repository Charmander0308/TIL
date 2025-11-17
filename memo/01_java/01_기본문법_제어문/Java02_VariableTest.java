
public class Java02_VariableTest {
	public static void main(String[] args) {
		// 변수 작명규칙
		// - 대소문자를 구분한다
		// - 공백은 허용되지 않는다
		// - 숫자로 시작할 수 없다.
		// - '$'와 '_'를 변수 이름에 사용할 수 있다. 이외의 특수문자는 허용되지 않는다.
		// - 예약어(keyword : 자바 문법을 위해서 미리 지정되어 있는 단어)는 사용할 수 없다.
		// - 합성어의 경우 주로 camelCase를 활용한다.
		// - 한글을 이용한 변수 작명 가능(권장 X)

		// 변수 선언
		// 자료형 변수이름;
		int age;
		int _age;
		int $age$;

		// 변수 초기화
		// 자료형 변수이름 = 초기값;
		int money = 10000;

		// 변수를 선언만하고 출력할 수 있을까?
		int a;
//         System.out.println(a);
	}
}
