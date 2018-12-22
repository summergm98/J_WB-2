package workbook.StepF;

import java.util.Scanner;

public class F09 {
	private int monthdays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private int month, day;
	private int day_count;
	private int i;
	
	public F09() {
		getData();
	}
	
	public void printR() {
		cmpDay();
		System.out.println("이 날짜는 1년 중 " + day_count + "번째 날에 해당됩니다");
	}
	void getData() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("월을 입력하세요: ");
		this.month = s.nextInt();
		System.out.print("일을 입력하세요: ");
		this.day = s.nextInt();
	}
	
	void cmpDay() {
		day_count = 0;
		
		for(i = 0; i < month - 1; i++) {
			day_count += monthdays[i];
		}
		
		day_count += day;
	}
}
