package workbook.StepI;

import java.util.Scanner;

public class I04 {
	private int total;
	private int menu;
	public I04() {
		menu = 0;
		total = 0;
		
		while(menu != -1) {
			menu = selectMenu();
			System.out.println("현재까지의 주문 금액은 " + total + "원 입니다");
		}
		
		System.out.println("\n총 주문 금액은 " + total + "원 입니다");
	}
	int selectMenu() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("1.피자(15,000원) 2.스파게티(10,000원) 3.샐러드(7,000원) 4.음료수(2,000원)");
		System.out.print("메뉴를 선택해주세요 (종료 : 5 ) : ");
		this.menu = s.nextInt();
		
		if(menu == 1) {
			total += 15000;
			return 15000;
		}else if(menu == 2) {
			total += 10000;
			return 10000;
		}else if(menu == 3) {
			total += 7000;
			return 7000;
		}else if(menu == 4) {
			total += 2000;
			return 2000;
		}else {
			return -1;
		}
	}
}
