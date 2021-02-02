package generic;

class Box1<T> {
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}

public class GenericClass {

	public static void main(String[] args) {
		Box1<String> b1 = new Box1<String>(); // 내가 String으로 사용하겠다면
		Box1<Integer> b2 = new Box1<Integer>(); // 내가 Integer로 사용하겠다면
		b1.setData("HELLO MOTHER FUCKERS");
		b1.getData();		
		// Integer i = (Integer)b1.getData(); 이 지랄은 안됩니다 이제
	}

}
