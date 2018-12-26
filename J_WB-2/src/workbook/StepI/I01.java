package workbook.StepI;

import java.util.Scanner;

public class I01 {
	private int payment;
	private int menu;
	
	public I01() {
		payment = 0;
		
		while(true) {
			showMenu();
			getMenu();
			
			if(menu == 5)
				break;
		}
		
		System.out.println("\n총 주문 금액은  " + payment + "원 입니다");
	}
	
	void showMenu() {
		System.out.println("1.피자(15,000원) 2.스파게티(10,000원) 3.샐러드(7,000원) 4.음료수(2,000원)");
	}
	
	void getMenu() {
		Scanner s = new Scanner(System.in);
		System.out.print("메뉴를 선택해 주세요, (종료 : 5) ");
		this.menu = s.nextInt();
		
		if(menu == 1)
			payment += 15000;
		else if(menu == 2)
			payment += 10000;
		else if(menu == 3)
			payment += 7000;
		else if(menu == 4)
			payment += 2000;
		else if(menu == 5)
			return;
		
		System.out.println("현재까지의 주문 금액은 " + payment + "원 입니다");
	}
}
