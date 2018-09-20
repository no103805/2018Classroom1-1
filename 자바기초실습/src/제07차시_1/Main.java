package 제07차시_1;

public class Main {

	public static void main(String[] args) {
		Car myCar= new Car();
		
		myCar.차종="벤츠";
		myCar.제조사="벤츠 회사";
		
		System.out.println(myCar.차종);
		System.out.println(myCar.제조사);
	
		myCar.시동건다();
	}

}
