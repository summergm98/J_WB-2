package workbook.StepK;

import java.util.Scanner;

class MenuPan{
	private int num = 0;
	private String[] name = new String[100];
	private String[] from = new String[100];
	private int[] cost = new int[100];
	
	public MenuPan() {
		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("메뉴의 번호, 메뉴명, 원산지, 가격을 입력하세요 : ");
		this.num = s.nextInt();
		this.name[num - 1] = s.next();
		this.from[num - 1] = s.next();
		this.cost[num - 1] = s.nextInt();
	}
	
	void output(int n) {
		System.out.println((n + 1) + " / " + name[n] + " / " + from[n] + " / " + cost[n]);
	}
}
public class K01 {
	public void main() {
		MenuPan m = new MenuPan();
		m.input();
		System.out.println("메뉴번호 / 메뉴이름 / 원산지 / 1인분 가격");
		m.output(0);
	}
}
