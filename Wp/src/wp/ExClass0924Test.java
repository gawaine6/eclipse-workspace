package wp;

public class ExClass0924Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member();
		// m.phone("1234"); 로 하면 접근을 못한다
		// 왜냐!! Member에서 Phone는 private 이기 때문이다
		// 그래서 set, get을 만들어준다!!
		// 그러면 setPhone, getPhone으로 접근할 수 있다!!
		
		m.setPhone("1234");
		System.out.println(m.getPhone());
	}

}
