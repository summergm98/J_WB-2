package workbook.StepG;

import java.util.Scanner;

public class G02 {
	private double input_degree;
	private double degrees[] = new double[10];
	private String degree_name[] = {"냉수", "미온수", "온수", "끓는물"};
	private int count[] = {0, 0, 0, 0};
	private int sel;
	
	public G02() {
		getDegree();
	}
	
	public void printName() {
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d번 물의 온도는 %.1f도 입니다 -> ", i + 1, degrees[i]);
			if(degrees[i] >= 0 && degrees[i] < 25)
				System.out.println(degree_name[0]);
			else if(degrees[i] >= 25 && degrees[i] < 40)
				System.out.println(degree_name[1]);
			else if(degrees[i] >= 40 && degrees[i] < 80)
				System.out.println(degree_name[2]);
			else if(degrees[i] >= 80)
				System.out.println(degree_name[3]);
		}
	}
	
	public void printNum() {
		System.out.println("냉수 입력 횟수 : " + count[0]);
		System.out.println("미온수 입력 횟수 : " + count[1]);
		System.out.println("온수 입력 횟수 : " + count[2]);
		System.out.println("끓는물 입력 횟수 : " + count[3]);
	}
	
	void getDegree() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d번 물의 온도를 입력하세요( >=0 ): ", i + 1);
			this.input_degree = s.nextDouble();
			
			countDegree(input_degree);
			degrees[i] = input_degree;
		}
	}
	
	void countDegree(double degree) {
		if(degree >= 0 && degree < 25)
			count[0]++;
		else if(degree >= 25 && degree < 40)
			count[1]++;
		else if(degree >= 40 && degree < 80)
			count[2]++;
		else if(degree >= 80)
			count[3]++;
	}
}
