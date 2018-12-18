package workbook.StepC;

import java.util.Scanner;

public class C04 {

	private double m2_area, pyung_area;
	
	public C04() {
		input();
	}
	
	public void printfResult() {
		System.out.printf("아파트의 평형은 %.1f 이고,\n", getPyung());
		
		if(pyung_area < 15.0)
			System.out.println("소형 아파트입니다");
		else if(pyung_area >= 15 && pyung_area < 30)
			System.out.println("중소형 아파트입니다");
		else if(pyung_area >= 30 && pyung_area < 50)
			System.out.println("중형 아파트입니다");
		else if(pyung_area >= 50)
			System.out.println("데형 아파트입니다");
		
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
