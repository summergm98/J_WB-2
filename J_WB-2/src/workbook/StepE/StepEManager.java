package workbook.StepE;

import java.util.Scanner;

public class StepEManager {
	public StepEManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. �Է��� ���� ũ���� ���簢�� ����ϱ�\n");
			printf("2. �Է��� ���� ũ���� ���̸� ���� ������ �ﰢ�� ����ϱ�\n");
			printf("3. �Է��� ���� ũ���� ���̸� ���� �̵ �ﰢ�� ����ϱ�\n");
			printf("4. 홀수단 또는 짝수단의 구구단 출력하기\n");
			printf("5. Ȧ���� �Ǵ� ¦������ �������� ���� ������ ���߾� ����ϱ�\n");
			printf("6. 2���� ���� ����ϱ�\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1:
				E01 e01 = new E01();
				e01.printSquare();
				break;
			case 2:
				E02 e02 = new E02();
				e02.printTri();
				break;
			case 3:
				E03 e03 = new E03();
				e03.printTri();
				break;
			case 4:
				E04 e04 = new E04();
				e04.printR();
				break;
			case 5:
				E05 e05 = new E05();
				e05.printR();
				break;
			case 6:
				E06 e06 = new E06();
				e06.printT();
				break;
			}
				
		}
		
	}
	void printf(String s){System.out.print(s);}
}
