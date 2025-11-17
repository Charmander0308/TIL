package 연결스택;

public class Node {
	public Integer data; //데이터 필드
	public Node link;    //다음 주소
	
	public Node(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", link=" + link + "]";
	}
}
