package java_basic;

public class SubjectScore {

	public static void main(String[] args) {
		int kor=76;
		int eng=80 ;
		int math=90;
		int scien=67;
		
		
		int total=0;
		float avg=0f;
		
		total = kor + eng + math + scien ;
		avg = total/4f;
		avg = (int)((avg*100+5)/10)/10f;
		System.out.println("국어\t영어\t수학\t과학\t총점\t평균");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%f", kor,eng,math,scien,total,avg);
	}

}
