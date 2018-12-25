package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class H04 {
	private int com_finger;
	private int my_finger;
	private int score[][] = new int[2][3];
	
	public H04() {
		
		for(int i = 0; i < 2; i++)
			for(int j = 0; j < 3; j++)
				score[i][j] = 0;
		
		while(true) {
			playingGame();
			if(my_finger == 0)
				break;
		}
		
		printResult();
	}
	
	void playingGame() {
		Scanner s = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("\n 가위(1), 바위(2), 보(3)를 입력하세요: ");
		this.my_finger = s.nextInt();
		
		this.com_finger = rand.nextInt(3) + 1;
		
		if(my_finger == 0) {
			return;
		}else if(my_finger == 1) {
			switch(com_finger) {
				case 1:
					System.out.println("컴퓨터가 낸 것은 가위입니다 ---> 비김!");
					score[0][0]++;
					score[1][0]++;
					break;
				case 2:
					System.out.println("컴퓨터가 낸 것은 바위입니다 ---> 컴퓨터 승!");
					score[0][1]++;
					score[1][2]++;
					break;
				case 3:
					System.out.println("컴퓨터가 낸 것은 보입니다 ---> 사용자 승!");
					score[0][2]++;
					score[1][1]++;
					break;
			}
		}else if(my_finger == 2) {
			switch(com_finger) {
				case 1:
					System.out.println("컴퓨터가 낸 것은 가위입니다 ---> 사용자 승!");
					score[0][2]++;
					score[1][1]++;
					break;
				case 2:
					System.out.println("컴퓨터가 낸 것은 바위입니다 ---> 비김!");
					score[0][0]++;
					score[1][0]++;
					break;
				case 3:
					System.out.println("컴퓨터가 낸 것은 보입니다 ---> 컴퓨터 승!");
					score[0][1]++;
					score[1][2]++;
					break;
			}
		}else if(my_finger == 3) {
			switch(com_finger) {
				case 1:
					System.out.println("컴퓨터가 낸 것은 가위입니다 ---> 컴퓨터 승!");
					score[0][1]++;
					score[1][2]++;
					break;
				case 2:
					System.out.println("컴퓨터가 낸 것은 바위입니다 ---> 사용자 승!");
					score[0][2]++;
					score[1][1]++;
					break;
				case 3:
					System.out.println("컴퓨터가 낸 것은 보입니다 ---> 비김!");
					score[0][0]++;
					score[1][0]++;
					break;
			}
		}
	}
	
	void printResult() {
		System.out.println("");
		System.out.println("컴퓨터 : 이긴 횟수는 " + score[0][1] +"회, 진 횟수는 " + score[0][2] + "회, 비긴 횟수는 " + score[0][0] + "회 입니다.");
		System.out.println("사용자 : 이긴 횟수는 " + score[1][1] +"회, 진 횟수는 " + score[1][2] + "회, 비긴 횟수는 " + score[1][0] + "회 입니다.");
	}
}
