package workbook.StepB;

import java.util.Scanner;


public class StepBManager {
	public StepBManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 미성년자 판정\n");
			printf("2. 온도 상호 변환\n");
			printf("3. 사각형 넓이 계산 및 정사각형 판정\n");
			printf("4. 아파트 평형 계산 및 종류 판정\n");
			printf("5. 날짜 계산\n");
			printf("6. 점수 계산\n");
			printf("7. 파일 전송 시간 계산\n");
			printf("8. 다양한 조건 판정\n");
			printf("9. 비만 판정\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				B01 b01 = new B01();
				b01.printResult();
				break;
			case 2:
				B02 b02 = new B02();
				b02.printDegree();
				break;
			case 3:
				B03 b03 = new B03();
				b03.result();
				break;
			case 4:
				B04 b04 = new B04();
				b04.printfResult();
				break;
			case 5:
				B05 b05 = new B05();
				b05.printResult();
				break;
			case 6:
				B06 b06 = new B06();
				b06.printResult();
				break;
			case 7:
				B07 b07 = new B07();
				b07.printTime();
				break;
			case 8:
				B08 b08 = new B08();
				b08.printResult();
			    break;
			case 9:
				B09 b09 = new B09();
				b09.printResult();
			}
				
		}
		
	}
	void printf(String s){System.out.print(s);}
}
