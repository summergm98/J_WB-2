package workbook.StepM;

import java.util.*;

public class StepMManager {
	public StepMManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 메뉴판 저장하기\n");
			printf("4. \n");
			printf("=>원하는 단계는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
				case 1:
					M01 m01 = new M01();
					m01.main();
					break;
			}			
		}
	}
	void printf(String s){System.out.print(s);}
}
