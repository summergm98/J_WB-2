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
			printf("5. ���� ��¥ ���\n");
			printf("6. ���� ���\n");
			printf("7. ���� ���� �ð� ���\n");
			printf("8. 3���� �� �� �ִ񰪰� �ּڰ� ���ϱ�\n");
			printf("9. �ҵ漼 ���\n");
			printf("10. ������ ��Ģ���� ����\n");
			printf("11. ���� �����ϱ�\n");
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
				break;
			case 5:
				C05 c05 = new C05();
				c05.printResult();
				break;
			case 6:
				C06 c06 = new C06();
				c06.printResult();
				break;
			case 7:
				C07 c07 = new C07();
				c07.printR();
				break;
			case 8:
				C08 c08 = new C08();
				c08.printR();
				break;
			case 9:
				C09 c09 = new C09();
				c09.printTax();
				break;
			case 10:
				C10 c10 = new C10();
				c10.printR();
				break;
			case 11:
				C11 c11 = new C11();
				c11.printR();
				break;
			}
				
		}
		
	}
	void printf(String s){System.out.print(s);}
}
