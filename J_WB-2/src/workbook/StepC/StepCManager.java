package workbook.StepC;

import java.util.Scanner;

public class StepCManager {
	public StepCManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. ���� ��� �� ���ɴ� ����\n");
			printf("2. ���� �µ� ���� ����\n");
			printf("3. ���簢�� ���� ����\n");
			printf("4. ����Ʈ ���� ��� �� ���� ����\n");
			printf("5. ���� ��¥ ���");
			printf("6. \n");
			printf("7. \n");
			printf("8. \n");
			printf("9. \n");
			printf("=>���ϴ� �޴���?(0:exit) :");
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
