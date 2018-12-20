package workbook.StepD;

import java.util.Scanner;

public class D05 {
	private int width, height;
	private int count1, count2, count3, count4, count5;
	
	public D05() {
		checkRectangle();
	}
	
	public void printR() {
		System.out.println("\"정사각형\"의 개수는 " + count1 + "개 입니다");
		System.out.println("\"좌우로 길쭉한 직사각형\"의 개수는 " + count2 + "개 입니다");
		System.out.println("\"위아래로 길쭉한 직사각형\"의 개수는 " + count3 + "개 입니다");
		System.out.println("\"일반적인 가로형 직사각형\"의 개수는 " + count4 + "개 입니다");
		System.out.println("\"일반적인 세로형 직사각형\"의 개수는 " + count5 + "개 입니다");
	}
	void checkRectangle() {
		while(true) {
			input();
			if(width <= 0 && height <= 0) {
				return;
			}else {
				if(width == height)
					count1++;
				else if(width >= 2 * height)
					count2++;
				else if(height >= 2 * width)
					count3++;
				else if(width > height)
					count4++;
				else if(width <height)
					count5++;
				}
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("직사각형의 가로 크기와 세로 크기를 입력하시오: ");
		this.width = s.nextInt();
		this.height = s.nextInt();
	}
}
