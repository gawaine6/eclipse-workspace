package generic;

class Box {
	private Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}

public class 지금까지했는방식 {

	public static void main(String[] args) {
		Box b = new Box();
		b.setData("HELLO");
		// String s = b.getData(); // 1. 자료형이 같지 않다, 2. Object가 String보다 더 큰 객체인데 큰 객체를(Object)를 작은 객체(String)안에 넣으려고 해서 에러가 생긴다 이마리야
		String s = (String)b.getData(); // 굳~~~이 변환하겠다고 하면 강제형변환을 해주셔야죠
		Integer i = (Integer)b.getData(); // 오류는 안 뜨는데 돌려보면 안된다고 지랄함
		// 강제 형변환은 직접 돌려보지 않으면 에러가 안 뜨는 경우가 많아서 좀 위험하다, 그래서 사용하는 방법이 Generic 입니동
	}

}
