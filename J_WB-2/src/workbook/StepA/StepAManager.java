package workbook.StepA;

import java.util.Scanner;

public class StepAManager {
	public StepAManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이계산\n");
			printf("2. 온도변환\n");
			printf("3. 직사각형 넓이계산\n");
			printf("4. 아파트 평형 계산\n");
			printf("5. 날짜계산\n");
			printf("6. 점수계산\n");
			printf("7. 파일 용량 계산\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				YearToAge yta = new YearToAge();
				yta.printAge();
			case 2:
				cTOf ctf = new cTOf();
				ctf.print_F();
			case 3:
				rectangle_area r_a = new rectangle_area();
				r_a.printArea();
			case 4:
				pyungToarea pta = new pyungToarea();
				pta.printArea();
			case 5:
				daysToSeconds dts= new daysToSeconds();
				dts.printSeconds();
			case 6:
				computeAverage ca = new computeAverage();
				ca.printTotal();
				ca.printAverage();
			case 7:
				computeBytes cb = new computeBytes();
				cb.printMegabytes();
				cb.printKilobytes();
				cb.printBytes();
			}
			
		}
		
	}
	void printf(String s){System.out.print(s);}
}
