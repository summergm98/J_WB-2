package workbook.StepJ;

import java.util.Scanner;

public class J05 {
	private int start_h ,start_m;
	private int end_h, end_m;
	private String repeat;
	private int count;
	private int pay;
	private int total_pay;
	
	public J05() {
		Scanner s = new Scanner(System.in);
		count = 0;
		total_pay = 0;
		
		while(true) {
			count++;
			System.out.print(count + "번 차량 주차 시작 시각(시 분) : ");
			this.start_h = s.nextInt();
			this.start_m = s.nextInt();
			
			System.out.print(count + "번 차량 주차 종료 시각(시 분) : ");
			this.end_h = s.nextInt();
			this.end_m = s.nextInt();
			
			pay = CalcParking(start_h, start_m, end_h, end_m);
			total_pay += pay;
			System.out.println("주차요금  : " + pay);
			
			System.out.print("더 입력하시겠습니까? (Y / N): " );
			this.repeat = s.next();
			
			if(repeat.compareToIgnoreCase("N") == 0)
				break;
		}
		
		System.out.println("주차차량 " + count + "대의 총 주차 요금은 " + total_pay + "원입니다");
	}
	
	int CalcParking(int start_h, int start_m, int end_h, int end_m) {
		int start = start_h * 60 + start_m;
		int end = end_h * 60 + end_m;
		int charge = ((end - start) / 10) * 500;
		if((end - start) % 10 != 0)
			charge += 500;
		return charge;
	}
}
