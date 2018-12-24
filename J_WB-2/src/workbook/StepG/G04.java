package workbook.StepG;

import java.util.Scanner;

public class G04 {
	private int kind;
	private int money;
	private int charge;
	private int total_charge;
	
	public G04() {
		total_charge = 0;
		
		while(true) {
			getInput();
			if(kind == 0)
				break;
			getCharge();
			printCharge();
		}
		printTotalCharge();
	}
	
	void printCharge() {
		System.out.println("이에 대한 중개 수수료는 " + charge +"원입니다");
	}
	
	void printTotalCharge() {
		System.out.println("지금까지의 수수료 총액은 " + total_charge + "원입니다");
	}
	void getInput() {
		Scanner s = new Scanner(System.in);
		System.out.print("부동산 거래종류(1: 매매, 2: 임대, 0: 계산종료)를 입력하세요 : ");
		this.kind = s.nextInt();
		if(kind == 0)
			return;
		System.out.print("부동산 거래 금액(원)을 입력하세요 : ");
		this.money = s.nextInt();
	}
	
	void getCharge() {
		if(kind == 1) {
			if(money < 50000000) {
				charge = (int) (money * 0.006);
				if(charge >= 250000)
					charge = 250000;
			}else if(money >= 50000000 && money < 200000000) {
				charge = (int) (money * 0.005);
				if(charge >= 800000)
					charge = 800000;
			}else if(money >= 200000000)
				charge = (int) (money * 0.004);
		}else if(kind == 2) {
			if(money < 20000000) {
				charge = (int) (money * 0.005);
				if(charge >= 70000)
					charge = 70000;
			}else if(money >= 20000000 && money < 50000000) {
				charge = (int) (money * 0.005);
				if(charge >= 200000)
					charge = 200000;
			}else if(money >= 50000000 && money < 100000000) {
				charge = (int) (money * 0.004);
				if(charge >= 300000)
					charge = 300000;
			}else if(money >= 100000000) {
				charge = (int) (money * 0.003);
			}
		}
		
		total_charge += charge;
	}
}
