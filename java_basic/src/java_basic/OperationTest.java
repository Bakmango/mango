package java_basic;

import java.util.Scanner;

public class OperationTest {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int inputfirstFloat = 0;
		int inputsecondFloat = 0;
		
		float sum =0f;
		float minus =0f;
		float multi =0f;
		float div =0f;
		
		int mock=0;
		int namuji=0;
		
		System.out.println("첫번째 수를 입력하세요 : ");
		inputfirstFloat = scann.nextInt();
		System.out.println("두번째 수를 입력하세요 : ");
		inputsecondFloat = scann.nextInt();
		
		sum = inputfirstFloat + inputsecondFloat;
		minus =inputfirstFloat - inputsecondFloat;
		multi = inputfirstFloat * inputsecondFloat;
		div =inputfirstFloat / (float)inputsecondFloat;
		
		mock = inputsecondFloat / inputfirstFloat;
		namuji = inputsecondFloat % inputfirstFloat;
		
		System.out.println("첫번째 정수 : "+inputfirstFloat);
		System.out.println("두번째 정수 : "+inputsecondFloat);
		System.out.println("더하기 : "+(sum));
		System.out.println("빼기 : "+(minus));
		System.out.println("곱하기 : "+(multi));
		System.out.println("나누기 : "+(div));
		System.out.println("몫 : "+(mock));
		System.out.println("나머지 : "+(namuji));

	}

}
