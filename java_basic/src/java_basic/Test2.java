package java_basic;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		    Scanner scann = new Scanner(System.in);
			
			int randomInt =0;
			
			double fir =0;
			double sec =0;
			double thr =0;
			double fur =0;
			
			System.out.println("정수 입력: ");
			randomInt = scann.nextInt();
			
			fir = (randomInt/1000);
			sec = ((randomInt/1000f-(int)fir)*10);
			thr = (((randomInt/1000f-(int)fir)*10-(int)sec)*10);
			fur = (((randomInt/1000f-(int)fir)*10-(int)sec)*10-(int)thr)*10;
			
//			 number / 1000;
//		     (number % 1000) / 100;
//		     (number % 100) / 10;
//		     number % 10;
			System.out.println("4자리 숫자 :"+(int)fur);
			System.out.println("3자리 숫자 :"+(int)thr);
			System.out.println("2자리 숫자 :"+(int)sec);
			System.out.println("1자리 숫자 :"+(int)fir);


	}

}
