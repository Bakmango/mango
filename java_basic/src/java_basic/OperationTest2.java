package java_basic;

import java.util.Scanner;

public class OperationTest2 {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		int kor=0;
		int eng=0 ;
		int math=0;
		int scien=0;
		
		System.out.println("���� : ");
		kor = scann.nextInt();
		System.out.println("���� : ");
		eng = scann.nextInt();
		System.out.println("���� : ");
		math = scann.nextInt();
		System.out.println("���� : ");
		scien = scann.nextInt();
		
		int total=0;
		float avg=0f;
		
		total = kor + eng + math + scien ;
		avg = total/4f;
		avg = (int)((avg*100+5)/10)/10f;
		System.out.println("����\t����\t����\t����\t����\t���");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%f", kor,eng,math,scien,total,avg);

	}

}
