package java_basic;

public class Operation3 {

	public static void main(String[] args) {
		int kor=76;
		int eng =80;
		int math=90;
		int sci=67;
		int total=0; 
		float average = 0f;
		
		total = kor + eng + math + sci ;
		average = (int)(((total *100)/4)+5)/100f;
		System.out.println(total);
		System.out.println(average);

	} 

}
