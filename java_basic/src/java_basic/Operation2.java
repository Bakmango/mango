package java_basic;

public class Operation2 {

	public static void main(String[] args) {
		float inputFloat = 1234.56789f;
		float outputFloat = 0f;
		
		outputFloat = (int)((inputFloat*100+5)/10)/10f;
		
		System.out.println("입력값 : " +inputFloat);
		System.out.println("반올림 : " +outputFloat);

	}

}
