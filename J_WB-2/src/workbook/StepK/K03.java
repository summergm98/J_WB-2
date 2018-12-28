package workbook.StepK;

import java.util.Scanner;
	
class point{
	private double x,y;
	private int[] area = new int[100];
	private int[] count = new int[4];
	public point() {
		
	}
	
	void getData(int n) {
		Scanner s = new Scanner(System.in);
		System.out.print((n + 1) + "번째 좌표의 x, y 값을 입력하세요: ");
		this.x = s.nextDouble();
		this.y = s.nextDouble();
		
		area[n] = get_area(x, y);
		
		if(area[n] == 1)
			count[0]++;
		else if(area[n] == 2)
			count[1]++;
		else if(area[n] == 3)
			count[2]++;
		else if(area[n] == 4)
			count[3]++;
	}
	
	int get_area(double x, double y) {
		if(x > 0 && y > 0)
			return 1;
		else if(x < 0 && y > 0)
			return 2;
		else if(x < 0 && y < 0)
			return 3;
		else if(x > 0 && y < 0)
			return 4;
		else 
			return 0;
	}
	
	void printArea(int n) {
		System.out.println((n + 1) + "번째 좌표는 " + area[n] + "사분면에 위치합니다");
	}
	
	void printCount() {
		for(int i = 0; i < 4; i++)
			System.out.println((i + 1) + "번째 좌표는 모두 " + count[i] + "개 입니다");
	}
}

public class K03 {
	public void main() {
		point p = new point();
		p.getData(0);
		p.printArea(0);
		p.printCount();
	}
}
