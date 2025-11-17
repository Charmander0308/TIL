
public class Java06_반복문4 {
	public static void main(String[] args) {
		// break : 가까이 있는 반복문을 종료
		// continue: 남아있는 구문을 수행하지 않고 다음 반복으로 이동

		// 다음은 무슨 의미? (짝수 단만 출력하겠다)
		for (int i = 2; i <= 9; i++) {
			if (i % 2 == 1)
				continue;
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}

//        // 다음은 무슨 의미? (5단까지만 출력하겠다)
//        for (int i = 2; i <= 9; i++) {
//            if (i > 5)
//                break;
//            System.out.println(i + "단");
//            for (int j = 1; j <= 9; j++) {
//                System.out.printf("%d * %d = %d\n", i, j, i * j);
//            }
//        }
//
//        // 다음은 무슨 의미? (각 단의 5번째 줄까지 출력하겠다)
//        for (int i = 2; i <= 9; i++) {
//            System.out.println(i + "단");
//            for (int j = 1; j <= 9; j++) {
//                if (j > 5)
//                    break;
//                System.out.printf("%d * %d = %d\n", i, j, i * j);
//            }
//        }
//
//        // 다음은 무슨 의미? (2단의 5번째 줄까지 출력하고 멈춤)
//        out: for (int i = 2; i <= 9; i++) {
//            System.out.println(i + "단");
//            for (int j = 1; j <= 9; j++) {
//                if (j > 5)
//                    break out;
//                System.out.printf("%d * %d = %d\n", i, j, i * j);
//            }
//        }
//        
//        // 다음은 무슨 의미? (2단의 5번째 줄까지 출력하고 멈춤)
//        out: for (int i = 2; i <= 9; i++) {
//            System.out.println(i + "단");
//            for (int j = 1; j <= 9; j++) {
//                if (j > 5)
//                   continue out;
//                System.out.printf("%d * %d = %d\n", i, j, i * j);
//            }
//        }
//        

	}
}
