package workbook.StepG;

import java.util.Scanner;

public class G06 {
	private int order[] = {0, 0, 0};
	private int sale;
	private int total_sale;
	private int total_order[] = {0, 0, 0};
	private int price[] = {10000, 6000, 3000};
	
	public G06() {
		total_sale = 0;
		
		System.out.println("세 종류의 제품이 있습니다");
		System.out.println("(1. 가죽장갑: 1만원, 2. 털장감: 6천원, 3. 비닐장갑: 3천원)\n");
		
		getOrder();
	}
	
	void getOrder() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			sale = 0;
			for(int i = 0; i < 3; i++) {
				System.out.print((i + 1) + "번 제품은 몇개를 구입하시겠습니까? ");
				this.order[i] = s.nextInt();
				sale += price[i] * order[i];
			}
			
			if(order[0] == 0 && order[1] == 0 && order[2] == 0)
				break;
			
			total_sale += sale;
			printSale();
		}
		
		System.out.println("지금까지의 총 매출 금액은 "+ total_sale + "원입니다");
	}

	void printSale() {
		System.out.println("판매 금액은 " + sale +"원입니다\n");
	}
}
