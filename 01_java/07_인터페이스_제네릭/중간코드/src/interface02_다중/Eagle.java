package interface02_다중;

//얼리버드 -> 오늘의 채팅왕 (서14조병국)
public class Eagle implements Bird {
	// 구현의 강제성 부여!
	@Override
	public void swim() {
		System.out.println("물속 사냥을한다.");
	}

	@Override
	public void fly() {
		System.out.println("날아다닌다.");
	}

	@Override
	public void eat() {
		System.out.println("먹는다!");
	}

}
