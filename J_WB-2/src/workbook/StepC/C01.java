package workbook.StepC;

import java.util.Scanner;

public class C01 {
	private int birth_year;
	private int age;
	
	public C01() {
		input();
	}
	
	void printResult() {
		age = computeAge();
		
		if( age < 7 )
			System.out.println("유아입니다");
		else if( age >= 7 && age < 13 )
			System.out.println("어린이입니다");
		else if( age >= 13 && age < 20 )
			System.out.println("청소년입니다");
		else if( age >= 20 && age < 30 )
			System.out.println("청년입니다");
		else if( age >= 30 && age < 60 )
			System.out.println("중년입니다");
		else if( age >= 60 )
			System.out.println("노년입니다");
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("태어난 년도를 입력하세요: " );
		this.birth_year = s.nextInt();
	}
	
	int computeAge() {
		age = 2018 - birth_year + 1;
		return age;
	}
}

