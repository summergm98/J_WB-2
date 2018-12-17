package workbook.StepB;

import java.util.Scanner;

public class B02 {
	private double input_degree;
	private String kind;
	private double output_degree;
	
	public B02() {
		input();
	}
	
	public void printDegree() {
		computeDegree();
		
		System.out.printf("변환된 온도는 %.1f 입니다\n", output_degree);
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("온도를 입력하세요: ");
		this.input_degree = s.nextDouble();
		
		System.out.printf("입력하신 온도가 섭씨온도이면 C 를, 화씨온도이면 F 를 입력하세요: ");
		this.kind = s.next();
	}
	
	void computeDegree() {
		if(kind.compareTo("C") == 0 || kind.compareTo("c") == 0) {
			output_degree = input_degree * 1.8 + 32;
		}else {
			output_degree = (input_degree - 32) / 1.8;
		}
	}
}
