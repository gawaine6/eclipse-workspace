package wp;

public class Person {
	private int id;
	private String name;
	
	public Person() {
		this(1901135, "Bae Soon Chul");
	}
	/* 
	 * 근데 9번까지해서 보면 자바 빈즈의 조건을 만족하지 못한다
	 * 왜냐면 인수가 없는 기본 생성자가 있어야 하는데 안에 인수값 두개가 들어가 있기 때문이다
	 * 그래서 아래쪽에 어떤 걸 받는지 정확하게 명시해줘야할 필요가 있다
	 * useBean 을 사용하면 부르게 되는 건 아래쪽에 매개변수를 가진 애가 아니라 위에 있는 애들을 불러온다
	*/
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
