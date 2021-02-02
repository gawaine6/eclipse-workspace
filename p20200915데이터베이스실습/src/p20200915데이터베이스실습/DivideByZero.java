package p20200915데이터베이스실습;

import java.util.*;
// 예외처리에 대해서 알아봅시다
public class DivideByZero {

	public static void main(String[] args) {
		/*
		int x, y;
		Scanner scan = new Scanner(System.in);
		System.out.print("피제수 : ");
		x = scan.nextInt();
		System.out.print("제수 : ");
		y = scan.nextInt();
		try {
			int result = x / y;
			System.out.println("나누기 결과 : " + result);
		} catch (ArithmeticException e) {
			System.out.println("Exception Occured. You can't divide by 0(Zero).");
			e.printStackTrace(); // 오류 발생시 출력해주는 거, 안 써주면 어떤 오류인지 출력안된다. try/catch 쓰면 기본으로 탑재
		} finally {
			System.out.print("try/catch over");
		}
		*/
		int[] array = {1, 2, 3, 4, 5};
		int i = 0;
		int x, y;
		Scanner scan = new Scanner(System.in);
		System.out.print("피제수 : ");
		x = scan.nextInt();
		System.out.print("제수 : ");
		y = scan.nextInt();
		
		try {
			int result = x / y;
			System.out.println("Result : " + result);
			
			for(i = 0; i < array.length; i++)
				System.out.println(array[i] + " ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Occured : Array.length is flooded");
			e.printStackTrace(); // ArrayIndexOutOfBoundsException
		} catch (ArithmeticException e) {
			System.out.println("Exception Occured : You can't divide by Zero");
			e.printStackTrace();
		}
		System.out.println("Program Over");
	}

}
/* 근데 0으로 나누니까 ArithmeticException 오류가 뜨는데 예외처리를 안해줘서 그런거랜다
 * 예외 처리는 try{} catch{} finally{} 구문을 기본으로 한다
 * 이제 위 구문을 가지고 예외 구문을 만들어봅세
 * 
 * 만약에 예외가 여러 개 나온다면 어떻게 될까??
 * 위처럼 ArrayIndexOutOfBoundsException 만 넣게 되면 반복문의 예외만 출력된다
 * result 를 10 / 0 을 하면 예외가 나와야 하지만 예외처리 해주는 게 for에 대한 것 밖에 없어서 오류에 걸려서 다음 문장 실행을 못한다
 * 그래서 예외가 여러 개 나올 수도 있을 때는 catch 문을 여러 개 만드는 방법이 있다
 * 
 */
