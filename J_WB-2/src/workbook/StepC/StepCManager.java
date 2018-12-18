package workbook.StepC;

import java.util.Scanner;

public class StepCManager {
	public StepCManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이 계산 및 연령대 판정\n");
			printf("2. 물의 온도 구간 판정\n");
			printf("3. 직사각형 형태 판정\n");
			printf("4. 아파트 평형 계산 및 종류 판정\n");
			printf("5. 연중 날짜 계산");
			printf("6. \n");
			printf("7. \n");
			printf("8. \n");
			printf("9. \n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1:
				C01 c01 = new C01();
				c01.printResult();
				break;
			case 2:
				C02 c02 = new C02();
				c02.printResult();
				break;
			case 3:
				C03 c03 = new C03();
				c03.printResult();
				break;
			case 4:
				C04 c04 = new C04();
				c04.printfResult();
			case 5:
				C05 c05 = new C05();
				c05.printResult();
			}
				
		}
		
	}
	void printf(String s){System.out.print(s);}
}
