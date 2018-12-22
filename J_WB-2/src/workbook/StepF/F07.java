package workbook.StepF;

import java.util.Scanner;

public class F07 {
	private int number[][] = new int[5][3];
	private int newnum;
	private int floor_total[] = new int[5];
	private int line_total[] = new int[3];
	private int total;
	private int ho;
	private int i, j;

	public F07() {
		getData();
	}
		
	public void printR() {
		
		getTotal();
		getFloor();
		getLine();
		
		for(i = 0; i < 5; i++)
			System.out.println((i+1) + "층에 사는 거주자는 모두 " + floor_total[i] + "명 입니다");
		System.out.println(" ");
		
		for(j = 0; j < 3; j++)
			System.out.println((j+1) + "호 라인에 사는 거주자는 모두 " + line_total[j] + "명 입니다");
		System.out.println(" ");
		
		System.out.println("이 아파트에 사는 거주자는 모두 " + total + "명 입니다.");
	}
		
	void getData() {
		Scanner s = new Scanner(System.in);
			
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 3; j++) {
				ho = (i + 1) * 100 + j + 1;
				System.out.printf("%d호에 살고 있는 사람의 숫자를 입력하시오 : ", ho);
				this.newnum = s.nextInt();
				number[i][j] = newnum;
			}
		}
	}
	
	void getTotal() {
		total = 0;
		
		for(i = 0; i < 5; i++)
			for(j = 0; j < 3; j++)
				total += number[i][j];
	}
	
	void getFloor() {
		for(i = 0; i < 5; i++)
			floor_total[i] = 0;
		
		for(i = 0; i < 5; i++)
			for(j = 0; j < 3; j++)
				floor_total[i] += number[i][j];
	}
	
	void getLine() {
		for(i = 0; i < 3; i++)
			line_total[i] = 0;
		
		for(i = 0; i < 3; i++)
			for(j = 0; j < 5; j++)
				line_total[i] += number[j][i];
	}

}
