package workbook.StepB;

import java.util.Scanner;

public class B04 {
	private double m2_area, pyung_area;
	
	public B04() {
		input();
	}

	public void printfResult() {
		System.out.printf("아파트의 평형은 %.1f 이고,\n", getPyung());
		
		if(pyung_area < 30)
			System.out.printf("30평 미만이므로 작은 아파트입니다\n");
		else
			System.out.printf("30평 이상이므로 큰 아파트입니다\n");
		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("아파트의 분양 면적(제곱미터)을 입력하시오: ");
		this.m2_area = s.nextDouble();
	}
	
	double getPyung() {
		pyung_area = m2_area / 3.305;
		return pyung_area;
	}
}
