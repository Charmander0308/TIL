package linkedList.연결스택;

public class Node {
	public Integer data;
	public Node link;
	
	public Node(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", link=" + link + "]";
	}

}
