package tree;

public class Tree01_순회 {
	//1차원 배열을 이용한 입력을 준다!
	static char[] tree = {'\u0000','A','B','C','D','E','F','G','\u0000','\u0000','H','I'};
	static int N = tree.length;
	
	public static void main(String[] args) {
		System.out.println("전위순회");
		preOrder(1);
		System.out.println("중위순회");
		inOrder(1);
		System.out.println("후위순회");
		postOrder(1);
		
	}
	
	//전위 순회 (VLR)
	//v: 현재 노드의 번호!
	public static void preOrder(int v) {
		//v is not null	//일단 Go! -> 왼자 있니? 오자 있니? 물어보며 갈 수도 있다!
		//조건을 작성하는 순서.. 별거 아닌거같아도 굉장히 중요할지도?
		if(v < N && tree[v] != '\u0000') {	// (tree[v] != '\u0000' && v < N) 로 작성하면 런타임에러 발생
			System.out.println(tree[v]);	//방문처리 출력
			//왼자탐색
			preOrder(v*2);
			//오자탐색
			preOrder(v*2+1);
		}
		
	}
	public static void inOrder(int v) {
		//v is not null
		//조건을 작성하는 순서.. 별거 아닌거같아도 굉장히 중요할지도?
		if(v < N && tree[v] != '\u0000') {	// (tree[v] != '\u0000' && v < N) 로 작성하면 런타임에러 발생
			//왼자탐색
			preOrder(v*2);
			System.out.println(tree[v]);	//방문처리 출력
			//오자탐색
			preOrder(v*2+1);
		}
		
	}
	public static void postOrder(int v) {
		//v is not null
		//조건을 작성하는 순서.. 별거 아닌거같아도 굉장히 중요할지도?
		if(v < N && tree[v] != '\u0000') {	// (tree[v] != '\u0000' && v < N) 로 작성하면 런타임에러 발생
			//왼자탐색
			preOrder(v*2);
			//오자탐색
			preOrder(v*2+1);
			System.out.println(tree[v]);	//방문처리 출력
		}
		
	}
	
	
}
