package workbook.StepI;

import java.util.Scanner;

public class StepIManager {
	public StepIManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 메뉴판 보여주는 메소드 만들기\n");
			printf("2. 빈칸과 함께 특정 문자를 개수만큼 찍는 메소드 만들기\n");
			printf("3. 비만 판정\n");
			printf("4. 메뉴 번호 받아오는 메소드 만들기\n");
			printf("5. 최댓값 리턴하는 메소드 만들기\n");
			printf("6. 임의의 숫자를 만들어 구간을 리턴하는 메소드 만들기\n");
			printf("7. 자판기에서 선택한 음료 가격을 리턴하는 메소드 만들기\n");
			printf("=>원하는 단계는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1:
				I01 i01 = new I01();
				break;
			case 2:
				I02 i02 = new I02();
				break;
			case 3:
				I03 i03 = new I03();
				break;
			case 4:
				I04 i04 = new I04();
				break;
			case 5:
				I05 i05 = new I05();
				break;
			case 6:
				I06 i06 = new I06();
				break;
			case 7:
				I07 i07 = new I07();
				break;
			}
				
		}
		
	}
	void printf(String s){System.out.print(s);}
}
