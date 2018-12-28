package workbook.StepK;

import java.util.Scanner;

public class K04 {
	public void main() {		
		int count = getNum();
		point p = new point();
		
		for(int i = 0; i < count; i++) {
			p.getData(i);
		}
		
		for(int i = 0; i < count; i++) {
			p.printArea(i);
		}
		
		p.printCount();
	}
	
	int getNum() {
		Scanner s = new Scanner(System.in);
		System.out.print("몇개의 좌표를 입력하시겠습니까? ");
		return s.nextInt();
	}
}
