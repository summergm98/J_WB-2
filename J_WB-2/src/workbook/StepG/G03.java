package workbook.StepG;

import java.util.Scanner;

public class G03 {
	private int jumsu[][] = new int[5][3];
	private double c_average[] = new double[3];
	private String class_name[] = {"국어", "영어", "수학"};
	private int kor, eng, math;
	
	public G03() {
		getScore();
	}
	
	public void printAverPerClass() {
		System.out.println("1) 각 과목별 총점과 평균 점수");
		System.out.printf("국어 과목 총점은 %d 평균은 %.1f 입니다\n" , getTotalPerClass(0), getAveragePerClass(0));
		System.out.printf("영어 과목 총점은 %d 평균은 %.1f 입니다\n" , getTotalPerClass(1), getAveragePerClass(1));
		System.out.printf("수학 과목 총점은 %d 평균은 %.1f 입니다\n" , getTotalPerClass(2), getAveragePerClass(2));
	}
	
	public void printPerPerson() {
		for(int i = 0; i < 5; i++)
			System.out.printf("%d번 학생 점수 : 총점 %d, 평균 %.1f, 등급 %s\n", i + 1, getTotalPerPerson(i), getAveragePerPerson(i), getGrade(getAveragePerPerson(i)));
	}
	
	void getScore() {
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d번 학생의 국어, 영어, 수학 점수는? ", i + 1);
			this.kor = s.nextInt();
			this.eng = s.nextInt();
			this.math = s.nextInt();
			
			jumsu[i][0] = kor;
			jumsu[i][1] = eng;
			jumsu[i][2] = math;
		}
	}
	
	int getTotalPerClass(int Class) {
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			sum += jumsu[i][Class];
		}
		
		return sum;
	}
	
	int getTotalPerPerson(int person) {
		int sum = 0;
		
		for(int i = 0; i < 3; i++)
			sum += jumsu[person][i];

		return sum;
	}
	
	double getAveragePerClass(int Class) {
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			sum += jumsu[i][Class];
		}
		double average = sum / 5;
		
		return average;
	}
	
	double getAveragePerPerson(int person) {
		int sum = 0;
		
		for(int i = 0; i < 3; i++)
			sum += jumsu[person][i];
		
		double average = sum / 3;
		
		return average;
	}
	
	String getGrade(double score) {
		if(score >= 90)
			return "A";
		else if(score < 90 && score >= 80)
			return "B";
		else if(score < 80 && score >= 70)
			return "C";
		else if(score < 70 && score >= 60)
			return "D";
		else
			return "F";
	}
}
