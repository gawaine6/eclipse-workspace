package generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class 백터 {

	public static void main(String[] args) {
		Vector<String> vc = new Vector<String>();
		
		vc.add("hello");
		vc.add(new String("10"));
		vc.add("20");
		
		System.out.println("vector size : " + vc.size());
				
		for(int i = 0; i < vc.size(); i++) {
			System.out.println("vector element : " + i +  " " + vc.get(i));
		}
		// 그냥 Vector 만 하면 아래 .add 메소드에 노란줄이 존나게 뜹니다 왜 그럴까요 씌팔꺼
		// generic 클래스를 generic 클래스처럼 사용하지 않아서 노란맛이 뜨는겁니다
		
		// ArrayList<String> list = new ArrayList<String>();
		// LinkedList는 ArrayList랑 생긴게 똑같습니다 그래서 위에 껄 주석처리하고 LinkedList를 해볼거에
		LinkedList<String> list = new LinkedList<String>();
		list.add("milk");
		list.add("bread");
		list.add("butter");
		list.add("knife");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------------------------");
		
		list.add(1, "apple"); // 메소드 오버로딩 : 메소드 이름은 같은데 매개변수만 다르게 주는거 (자매품 : 이름하고 변수는 같은데 동작을 재정의 해야하는 '오버라이딩' 판매중)		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		list.set(2, "grape");
		System.out.println("---------------------------------");
		// 반복자를 이용해서 Collection 원소 출력, ResultSet의 커서랑 같은 개념이라고 보시면 되유
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("---------------------------------");
		// 사과삭제
		list.remove("apple"); 
		// list.remove(index no); remove 같은 경우에는 ArrayList의 인덱스 번호를 주거나, 들어간 값(Object)을 입력해줘도 삭제할 수 있다
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------------------------");
		
		// 포도가 저장된 인덱스를 출력하세용
		int k = list.indexOf("grape");
		System.out.println(k);
		System.out.println("---------------------------------");
		// 인덱스를 이용해서 포도를 삭제해보세용
		list.remove(k);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------------------------");
		String[] arrayS = new String[10];
		list.toArray(arrayS);
		
		for(int i = 0; i < arrayS.length; i++) {
			System.out.println("i : " + arrayS[i]);
		}
		System.out.println("---------------------------------");
		// arrayS배열을 ArrayList로 출력해봅시다
		List<String> toList = Arrays.asList(arrayS);
		System.out.println(toList);
		
		
	}
}
