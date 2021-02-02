package 자바연습;

/*
class Person<T> {
	public T info;
}
class StudentInfo {
	public int grade;
	StudentInfo(int grade) {
		this.grade = grade;
	}
}
class StudentPerson {
	public StudentInfo info;
	StudentPerson(StudentInfo info) { // StudentInfo의 데이터타입을 받고 info 라는 필드의 데이터를 가져온다
		this.info = info;
	}
}
class EmployeeInfo {
	public int rank;
	EmployeeInfo(int rank) {
		this.rank = rank;
	}
}
class EmployeePerson {
	public EmployeeInfo info;
	EmployeePerson(EmployeeInfo info) {
		this.info = info;
	}
}
// 근데 잘보면 StudentPerson과 EmployeePerson은 같은 매커니즘으로 돌아간다, 굳이 두개를 만들어줘야할 필요가 없다
// 그래서 이런 중복을 없애기 위해 사용하는게 Generic이다
*/
class StudentInfo {
	public int grade;
	StudentInfo(int grade) {
		this.grade = grade;
	}
}
class EmployeeInfo {
	public int rank;
	EmployeeInfo(int rank) {
		this.rank = rank;
	}
}
class Person<T, S> {
	public T info;
	public S id;
	Person(T info, S id) {
		this.info = info;
		this.id = id;
	}
//	public Object info;
//	Person(Object info) {
//		this.info = info;
//		// 앞에서는 Person을 따로 하나씩 만들어줬지만 여기서는 하나로 만들어줘야한다
//		// 이 때 공통으로 사용되는 데이터 타입을 정해줘야 하는데 뭘 써야할지 마땅치가 않다
//		// 그래서 모든 데이터 타입을 포함하는 Object로 설정해준다	
//		// 설명 과정에서 나온겁니다, 이제 Generic을 쓸거니까 저것도 주석처리 해줍시다
//	}
}
public class Generic {

	public static void main(String[] args) {
		/*
		// 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법, 말이 시팔... Desktop/Java/에 보면 사진있음
		Person<String> p1 = new Person<String>();
		// 제네릭 타입이 String 이면 새로운 인스턴스 Person의 T가 String이 되서 public String info;
		Person<Integer> p2 = new Person<Integer>();
		// public Integer info;

		// 근데 이 짓을 왜 할까요??
		StudentInfo si = new StudentInfo(2);
		StudentPerson sp = new StudentPerson(si);
		System.out.println(sp.info.grade);
		
		EmployeeInfo ei = new EmployeeInfo(1);
		EmployeePerson ep = new EmployeePerson(ei);
		System.out.println(ep.info.rank);
		*/
		
		// Person p1 = new Person("HELLO");
		// 이렇게 안에다 뭘 써도 문법적으로 문제가 안되지만 우리가 의도한거랑은 다르다
		// EmployeeInfo ei = (EmployeeInfo)p1.info;
		// System.out.println(ei.rank);
		// ei는 구체적인 데이터타입이라서 강제 형변환을 해줘야한다, 컴파일 단계에서는 오류가 없는데 실행해보면 지랄한다
		// 위에서 우리는 info의 타입을 Object로 설정해서 어떤 데이터 타입이 올 수 있는 상황이다, 이러면 컴파일에서는 오류가 없지만 실행하면 지랄하는 사태가 발생한다
		// 이걸 보고 타입이 안전하지 않다라고 한다
		
		Integer id = new Integer(1);
		Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(new EmployeeInfo(1), id);
		Person<StudentInfo, Integer> p2 = new Person<StudentInfo, Integer>(new StudentInfo(1), id);
		System.out.println(p1.id.intValue()); // p1의 id를 원시데이터 타입으로 출력
		System.out.println(p2.id.intValue());
		
	}

}
