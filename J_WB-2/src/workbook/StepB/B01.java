package workbook.StepB;

import java.util.Scanner;

public class B01 {
	private int birth_year;
	private int age;
	
	public B01() {
		input();
	}
	
	public void printResult() {
		
		computeAge();
		
		if(age < 20)
			System.out.printf("미성년자입니다\n");
		else
			System.out.printf("미성년자가 아닙니다.\n");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("태어난 년도를 입력하세요: ");
		
		this.birth_year = s.nextInt();
	}
	
	void computeAge() {
		age = 2018 - birth_year + 1; 
	}
	
}
