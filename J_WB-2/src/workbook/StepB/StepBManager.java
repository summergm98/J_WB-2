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
			printf("4. ����Ʈ ���� ��� �� ���� ����\n");
			printf("5. ��¥ ���\n");
			printf("6. ���� ���\n");
			printf("7. ���� ���� �ð� ���\n");
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
			case 4:
				B04 b04 = new B04();
				b04.printfResult();
			case 5:
				B05 b05 = new B05();
				b05.printResult();
			case 6:
				B06 b06 = new B06();
				b06.printResult();
			case 7:
				B07 b07 = new B07();
				b07.printTime();
			}
				
		}
		
	}
	void printf(String s){System.out.print(s);}
}
