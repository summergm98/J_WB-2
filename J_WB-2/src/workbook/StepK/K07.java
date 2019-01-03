package workbook.StepK;

import java.util.Scanner;

class Student{
	int num;
	private int kor[] = new int[100];
	private int eng[] = new int[100];
	private int math[] = new int[100];
	private double average[] = new double[100];
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("등록할 학생 수는? ");
		this.num = s.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.print((i + 1) + "번 학생의 국어, 영어, 수학 점수를 입력하세요: ");
			this.kor[i] = s.nextInt();
			this.eng[i] = s.nextInt();
			this.math[i] = s.nextInt();
			getAverage(i);
		}
	}
	
	void getAverage(int index) {
		average[index] = (double) (kor[index] + eng[index] + math[index]) / 3;
	}
	
	void print(int index) {
		System.out.print((index + 1) + " / " + kor[index] + " / " + eng[index] + " / " + math[index] + " / " + (kor[index] + eng[index] + math[index]) + " / " + average[index]);
		if(average[index] >= 95)
			System.out.println(" / A+");
		else if(average[index] < 95 && average[index] >= 90)
			System.out.println(" / A");
		else if(average[index] < 90 && average[index] >= 85)
			System.out.println(" / B+");
		else if(average[index] < 85 && average[index] >= 80)
			System.out.println(" / B");
		else if(average[index] < 80 && average[index] >= 75)
			System.out.println(" / C+");
		else if(average[index] < 75 && average[index] >= 70)
			System.out.println(" / D+");
		else if(average[index] < 70 && average[index] >= 65)
			System.out.println("/ D");
		else 
			System.out.println(" / F");
		
	}
}

public class K07 {
	public void main() {
		Student s = new Student();
		s.input();
		
		System.out.println("등록된 " + s.num + "명의 학생 목록은 다음과 같습니다");
		System.out.println("------------------------------------");
		System.out.println("번호 / 국어 / 영어 / 수학 / 총점 / 평균 / 학점");
		
		for(int i = 0; i < s.num; i++)
			s.print(i);
	}
}
