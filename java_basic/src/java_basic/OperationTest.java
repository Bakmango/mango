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
		
		System.out.println("ù��° ���� �Է��ϼ��� : ");
		inputfirstFloat = scann.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ��� : ");
		inputsecondFloat = scann.nextInt();
		
		sum = inputfirstFloat + inputsecondFloat;
		minus =inputfirstFloat - inputsecondFloat;
		multi = inputfirstFloat * inputsecondFloat;
		div =inputfirstFloat / (float)inputsecondFloat;
		
		mock = inputsecondFloat / inputfirstFloat;
		namuji = inputsecondFloat % inputfirstFloat;
		
		System.out.println("ù��° ���� : "+inputfirstFloat);
		System.out.println("�ι�° ���� : "+inputsecondFloat);
		System.out.println("���ϱ� : "+(sum));
		System.out.println("���� : "+(minus));
		System.out.println("���ϱ� : "+(multi));
		System.out.println("������ : "+(div));
		System.out.println("�� : "+(mock));
		System.out.println("������ : "+(namuji));

	}

}
