package workbook.StepA;

import java.util.Scanner;

public class StepAManager {
	public StepAManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. ���̰��\n");
			printf("2. �µ���ȯ\n");
			printf("3. ���簢�� ���̰��\n");
			printf("4. ����Ʈ ���� ���\n");
			printf("5. ��¥���\n");
			printf("6. �������\n");
			printf("7. ���� �뷮 ���\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
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
