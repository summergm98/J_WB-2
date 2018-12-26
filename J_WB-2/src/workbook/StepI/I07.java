package workbook.StepI;

import java.util.Scanner;

public class I07 {
	private int can_num;
	private String repeat;
	private int total;
	private int count;
	
	public I07() {
		Scanner s = new Scanner(System.in);
		int pay = 0;
		count = 0;
		total = 0;
		
		while(true) {
			pay = SelectCan();
			count++;
			total += pay;
			
			System.out.print("더 필요하십니까?(Y/N) ");
			this.repeat = s.next();
			
			if(repeat.compareToIgnoreCase("N") == 0)
				break;
		}
		
		System.out.println(count + "개의 음료를 선택하요 총 " + total + "원입니다");
	}
	
	int SelectCan() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("1,콜라(700원) 2.원두커피(300원) 3.레몬주스(1000원)\n4.홍차(500원) 5.코코아(600원)");
		System.out.print("메뉴를 선택해주세요 : ");
		this.can_num = s.nextInt();
		
		if(can_num == 1)
			return 700;
		else if(can_num == 2)
			return 300;
		else if(can_num == 3)
			return 1000;
		else if(can_num == 4)
			return 500;
		else
			return 600;

	}
}
