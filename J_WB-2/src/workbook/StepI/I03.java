package workbook.StepI;

import java.util.Scanner;

public class I03 {
	private int height, weight;
	
	public I03() {	
		for(int n = 0; n < 10; n++) {
			getData(n);
			askBiman(height, weight);
		}
	}
	
	void getData(int n) {
		Scanner s = new Scanner(System.in);
		System.out.print((n+1) + "번쨰 사람의 신장(cm)과 체중(kg)을 입력하세요 : ");
		this.height = s.nextInt();
		this.weight = s.nextInt();
	}
	
	void askBiman(int height, int weight) {
		double m_height = (double) height / 100;
		
		double bmi = weight / (m_height * m_height);
		
		if(bmi < 18.5)
			System.out.println("저체중입니다");
		else if(bmi >= 18.5 && bmi < 23)
			System.out.println("정상체중입니다");
		else if(bmi >= 23 && bmi < 25)
			System.out.println("과체중입니다");
		else if(bmi >= 25 && bmi < 30)
			System.out.println("경도비만입니다");
		else if(bmi >= 30)
			System.out.println("고도비만입니다");
	}
}
