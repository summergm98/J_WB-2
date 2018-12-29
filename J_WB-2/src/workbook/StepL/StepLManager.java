package workbook.StepL;

import java.util.*;

public class StepLManager {
	public StepLManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 메뉴판 저장하기\n");
			printf("2. 주차장 입출력 관리\n");
			printf("3. \n");
			printf("4. \n");
			printf("=>원하는 단계는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1:
				L01 l01 = new L01();
				l01.Menu();
				break;
			case 2:
				L02 l02 = new L02();
				l02.main();
				break;
			}
		}
	}
	
	void printf(String s){System.out.print(s);}
}
