package workbook.StepJ;

import java.util.Scanner;

public class StepJManager {
	public StepJManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이 계산 및 연령대 판정\n");
			printf("2. 심사 점수 계산\n");
			printf("3. 물의 온도 구간 개수 판정\n");
			printf("4. 연중 날짜 계산 메소드를 이용한 날짜 간격 세기\n");
			printf("5. 주차 관리 시스템\n");
			printf("6. 피보나치 수 구하기\n");
			printf("7. 2의 제곱수 구하기\n");
			printf("8. Ackerman 수 구하기\n");
			printf("9. pow() 메소드 만들기\n");
			printf("10. 피보나치 수열로 황금비욜 구하기\n");
			printf("=>원하는 단계는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1:
				J01 j01 = new J01();
				break;
			case 2:
				J02 j02 = new J02();
				break;
			case 3:
				J03 j03 = new J03();
				break;
			case 4:
				J04 j04 = new J04();
				break;
			case 5:
				J05 j05 = new J05();
				break;
			case 6:
				J06 j06 = new J06();
				break;
			case 7:
				J07 j07 = new J07();
				break;
			case 8:
				J08 j08 = new J08();
				break;
			case 9:
				J09 j09 = new J09();
				break;
			case 10:
				J10 j10 = new J10();
				break;
			}
		}
	}
	
	void printf(String s){System.out.print(s);}
}
