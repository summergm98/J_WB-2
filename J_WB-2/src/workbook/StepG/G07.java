package workbook.StepG;

import java.util.Scanner; 

public class G07 {
	private int team_count;
	private int charge[] = {5000, 10000, 15000, 3000};
	private int count[] = new int[4];
	private int v_count[] = new int[4];
	private int total_count = 0;
	private int sum;
	private int total_sum = 0;
	private int membership = 0;
	
	public G07() {
		getTeam();
		getCharge();
	}
	
	public void printToday() {
		System.out.println("\n오늘 총 방문자 수는 " + total_count + "명입니다.");
		System.out.println("초등학생 수는 " + v_count[0] +"명입니다");
		System.out.println("청소년 수는 " + v_count[1] +"명입니다");
		System.out.println("일반인 수는 " + v_count[2] +"명입니다");
		System.out.println("경로 대상 수는 " + v_count[3] +"명입니다\n");
		System.out.println("총 입장료는 " + total_sum +"원입니다");
	}
	void getTeam() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("오늘 방문한 팀 수를 입력하세요: ");
		this.team_count = s.nextInt();
	}
	
	void getCharge() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < team_count; i++) {
			sum = 0;
			System.out.print((i + 1) + "번팀 인원수(초등학생, 청소년, 일반, 경로대상)를 입력하세요 : ");
			for(int j = 0; j < 4; j++) {
				this.count[j] = s.nextInt();
				sum += charge[j] * count[j];
				v_count[j] += count[j];
				total_count += count[j];
			}
			
			System.out.print((i + 1) + "번팀 할인 카드 종류(카드 없음: 0, 일반 등급: 1, VIP 등금: 2)를 입력하세요: ");
			this.membership = s.nextInt();
			
			if(membership == 1)
				sum -= sum*0.1;
			else if(membership == 2)
				sum -= sum*0.2;
			
			total_sum += sum;
			System.out.println((i + 1) + "번팀 입장료는 " + sum + "원입니다.");
		}
	}
}
