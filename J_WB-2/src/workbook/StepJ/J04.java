package workbook.StepJ;

import java.util.Scanner;

public class J04 {
	private int month, day;
	private int total1, total2;
	
	public J04() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫 번째 날짜를 입력하세요(월 일) : ");
		this.month = s.nextInt();
		this.day = s.nextInt();
		total1 = CalcDate(month, day);
		
		System.out.print("두 번째 날짜를 입력하세요(월 일) : ");
		this.month = s.nextInt();
		this.day = s.nextInt();
		total2 = CalcDate(month, day);
		
		if(total2> total1)
			System.out.println("두 날짜의 간격은 " + (total2 - total1) + "일입니다");
		else
			System.out.println("두 날짜의 간격은 " + (total1 - total2) + "일입니다");
	}
	
	int CalcDate(int month, int day) {
		int total = 0;
		if(month == 1)
			total = 0;
		else if(month == 2)
			total = 31;
		else if(month == 3)
			total = 59;
		else if(month == 4)
			total = 90;
		else if(month == 5)
			total = 120;
		else if(month == 6)
			total = 151;
		else if(month == 7)
			total = 181;
		else if(month == 8)
			total = 212;
		else if(month == 9)
			total = 243;
		else if(month == 10)
			total = 273;
		else if(month == 11)
			total = 304;
		else if(month == 12)
			total = 334;
		
		total = total + day;
		
		return total;
	}
}
