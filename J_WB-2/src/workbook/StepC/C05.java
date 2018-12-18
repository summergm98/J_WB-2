package workbook.StepC;

import java.util.Scanner;

public class C05 {
	private int month, day;
	private int day_count;
	
	public C05() {
		input();
	}
	
	public void printResult() {
		if(month > 12 || day > 31)
			System.out.println("잘못 입력하셨습니다");
		else
			System.out.printf("이 날짜는 1년 중 %d번째 날에 해당합니다.\n", cmpDay());
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("월을 입력하세요: ");
		this.month = s.nextInt();
		System.out.print("일을 입력하세요: ");
		this.day = s.nextInt();
	}
	
	int cmpDay() {
		
		if(month == 1)
			day_count = day;
		else if(month == 2)
			day_count = 31 + day;
		else if(month == 3)
			day_count = 59 + day;
		else if(month == 4)
			day_count = 90 + day;
		else if(month == 5)
			day_count = 120 + day;
		else if(month == 6)
			day_count = 151 + day;
		else if(month == 7)
			day_count = 181 + day;
		else if(month == 8)
			day_count = 212 + day;
		else if(month == 9)
			day_count = 243 + day;
		else if(month == 10)
			day_count = 273 + day;
		else if(month == 11)
			day_count = 304 + day;
		else if(month == 12)
			day_count = 334 + day;
		
		return day_count;		
	}
}
