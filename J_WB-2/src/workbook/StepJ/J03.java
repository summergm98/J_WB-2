package workbook.StepJ;

import java.util.Scanner;

public class J03 {
	private double degree[] = new double[10];
	private int count[] = new int[4];
	
	public J03(){
		getDegree();
		
		for(int i = 0; i < 10; i++) {
			count[AskWater(degree[i])]++;
			System.out.println((i + 1) +  "번 물의 온도는 " + degree[i] + "도 입니다");
		}
		
		System.out.println("냉수 입력 횟수는 " + count[0] + "입니다");
		System.out.println("미온수 입력 횟수는 " + count[1] + "입니다");
		System.out.println("온수 입력 횟수는 " + count[2] + "입니다");
		System.out.println("끓는 물 입력 횟수는 " + count[3] + "입니다");
		
	}
	
	void getDegree() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "번째 물의 온도를 입력하세요: ");
			this.degree[i] = s.nextDouble();
		}
	}
	
	byte AskWater(double degree) {
		if(degree >= 0 && degree < 25)
			return 0;
		else if(degree >= 25 && degree < 40)
			return 1;
		else if(degree >= 40 && degree < 80)
			return 2;
		else if(degree >= 80)
			return 3;
		else 
			return -1;
	}
}
