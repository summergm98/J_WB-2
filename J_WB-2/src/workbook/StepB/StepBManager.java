package workbook.StepB;

import java.util.Scanner;


public class StepBManager {
	public StepBManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. �̼����� ����\n");
			printf("2. �µ� ��ȣ ��ȯ\n");
			printf("3. �簢�� ���� ��� �� ���簢�� ����\n");
			printf("4. \n");
			printf("5. \n");
			printf("6. \n");
			printf("7. \n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				B01 b01 = new B01();
				b01.printResult();
			case 2:
				B02 b02 = new B02();
				b02.printDegree();
				
			case 3:
				B03 b03 = new B03();
				b03.result();
			}
				
		}
		
	}
	void printf(String s){System.out.print(s);}
}
