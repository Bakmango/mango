package java_basic;

import java.util.Scanner;

public class ConsoleInput {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);

//		정수 입력 scann.nextInt()
//		실수 입력 scann.nextFloat()
		
		System.out.print("정수를 입력");
		int inputInt = scann.nextInt();
		
		System.out.print("실수를 입력");
		float inputFloat = scann.nextFloat();
		
		System.out.println("실수를 입력 :"+inputInt);
		System.out.println("정수를 입력 :"+inputFloat);
		
		
	}

}
