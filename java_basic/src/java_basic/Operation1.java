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
		
		System.out.println("ù��° ���� : "+firstInt);
		System.out.println("�ι�° ���� : "+secondInt);
		System.out.println("���ϱ� : "+(sum));
		System.out.println("���� : "+(minus));
		System.out.println("���ϱ� : "+(multi));
		System.out.println("������ : "+(div));
		System.out.println("�� : "+(mock));
		System.out.println("������ : "+(namuji));
		
	}

}
