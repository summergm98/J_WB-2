package workbook.StepG;

import java.util.Scanner;

public class G05 {
	private int hour, minute;
	private int charge;
	private int total_charge;
	
	public G05() {
		getInput();
	}
	
	public void printTotalCharge() {
		System.out.println("\n지금까지의 이용료 총금액은 " + total_charge + "원입니다");
	}
	
	void getInput() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("사용한 시간을 시간과 분으로 입력하세요 : ");
			this.hour = s.nextInt();
			this.minute = s.nextInt();
			
			if(hour == 0 && minute == 0)
				break;
			else {
				cmpCharge(hour, minute);
				printCharge();
			}
		}
	}
	
	void cmpCharge(int h, int m) {
		int total_minute;
		total_minute = h * 60 + m;
		
		if(total_minute % 30 == 0)
			charge = (total_minute / 30) * 1000;
		else
			charge = (total_minute / 30 + 1) * 1000;
		
		if(h == 2)
			charge = (int) (charge - charge * 0.05);
		else if(h ==  3 || h == 4)
			charge = (int) (charge - charge * 0.1);
		else if(h >= 5)
			charge = (int) (charge - charge * 0.2);
		
		total_charge += charge;
	}
	
	void printCharge() {
		System.out.println("고객님의 이용료는 " + charge +"원입니다");
	}
}
