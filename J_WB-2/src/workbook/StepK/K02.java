package workbook.StepK;

import java.util.Scanner;

public class K02 {
	
	public void main() {
		MenuPan m = new MenuPan();
		int count = getNum();
		
		for(int i = 0; i < count; i++) {
			m.input();
		}
		
		System.out.println("메뉴번호 / 메뉴이름 / 원산지 / 1인분 가격");
		for(int i = 0; i < count; i++) {
			m.output(i);
		}
		
	}
	
	static int getNum() {
		Scanner s = new Scanner(System.in);
		System.out.print("등록하실 메뉴의 개수를 입력하세요 : ");
		return s.nextInt();
	}
}
