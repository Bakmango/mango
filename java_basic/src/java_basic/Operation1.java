package java_basic;

public class Operation1 {

	public static void main(String[] args) {
		int firstInt = 3;
		int secondInt = 5 ;
		
		float sum;
		float minus;
		float multi;
		float div;
		
		int mock;
		int namuji;
		
		sum = firstInt + secondInt;
		minus =firstInt - secondInt;
		multi = firstInt * secondInt;
		div =firstInt / (float)secondInt;
		
		mock = secondInt / firstInt;
		namuji = firstInt % secondInt;
		
		System.out.println("첫번째 정수 : "+firstInt);
		System.out.println("두번째 정수 : "+secondInt);
		System.out.println("더하기 : "+(sum));
		System.out.println("빼기 : "+(minus));
		System.out.println("곱하기 : "+(multi));
		System.out.println("나누기 : "+(div));
		System.out.println("몫 : "+(mock));
		System.out.println("나머지 : "+(namuji));
		
	}

}
