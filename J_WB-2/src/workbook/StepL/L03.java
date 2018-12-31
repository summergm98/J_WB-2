package workbook.StepL;

import java.text.SimpleDateFormat;
import java.util.*;

class Order{
	private int num = 0;
	private int[] menu = new int[3];
	private String time;
	private int cost = 0;
	private boolean card;
	
	public Order(int num, int[] menu, boolean card, String time, int cost) {
		// TODO Auto-generated constructor stub
		this.num = num;
		this.menu = menu;
		this.card = card;
		this.time = time;
		this.cost = cost;
	}
	
	public void print(int i) {
		char temp;
		
		if(card)
			temp = 'Y';
		else 
			temp = 'N';
		
		String temp2[] = time.split("-");
		
		System.out.println("[" + (i + 1) + "] " + num + " / " + menu[0] + " / " + menu[1] + " / " + menu[2] + " / " + temp + " / " + temp2[0] + "년 " + temp2[1] + "월 " + temp2[2] + "일 " + temp2[3] + ":" + temp2[4]);
	}
	
	public void printCost() {
		System.out.println("결제하실 금액은 총 " + cost + "원 입니다");
	}
}

public class L03 {
	Scanner s = new Scanner(System.in);
	ArrayList<Order> order = new ArrayList<Order>();
	
	public void main() {
		int menu = 0;
		
		while(true) {
			menu = getMenu();
			
			switch(menu) {
				case 1:
					input();
					break;
				case 2:
					List();
					payTable();
					break;
				case 3:
					List();
					break;
				case 4:
					System.out.println("종료되었습니다");
					return;
				default:
					System.out.println("Error : 올바른 메뉴 번호를 입력하세요");
					break;
			}
		}
	}
	
	private void payTable() {
		// TODO Auto-generated method stub
		System.out.print("--> 결제하실 번호를 입력하세요: ");
		int table = s.nextInt();
		
		order.get(table).printCost();
		order.remove(table);
		
		System.out.println("--> 결제완료 되었습니다.");
		
	}

	private void List() {
		// TODO Auto-generated method stub
		System.out.println("번호 / 손님 수 / 스테이크 / 스파게티 / 파스타 / 멤버쉽 / 입장시간");
		
		for(int i = 0; i < order.size(); i++)
			order.get(i).print(i);
		
	}

	int getMenu() {
		int menu = 0;
		
		System.out.print("----원하는 메뉴의 번호를 입력하세요----\n");
		System.out.print("1)주문 2)결제 3)리스트 4)종료 --> ");
		menu = s.nextInt();
		System.out.print("----------------------------\n");
		
		return menu;
	}
	
	void input() {
		SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-dd-hh-mm", Locale.KOREA);
		
		int num = 0;
		int cost = 0;
		int menu[] = new int[3];
		boolean card = false;
		
		System.out.print("손님 수를 입력하세요: ");
		num = s.nextInt();
		
		System.out.print("스테이크, 스파게티, 파스타의 개수를 입력하세요: ");
		for(int i = 0; i < 3; i++)
			menu[i] = s.nextInt();
		
		
		System.out.print("멤버쉽 카드가 있습니까? (Y / N) ");
		if(s.next().compareToIgnoreCase("Y") == 0)
			card = true;
		else
			card = false;
		
		cost = getCost(menu, card);
		
		String time = f.format(new Date());
		String temp[] = time.split("-");
		
		System.out.println("들어오신 시간은 " + temp[0] + "년 " + temp[1] + "월 " + temp[2] + "일 " + temp[3] + ":" + temp[4] + "입니다");
		System.out.println("총 금액은 " +  cost + "원 입니다\n");
		
		order.add(new Order(num, menu, card, time, cost));	
	}
	
	int getCost(int[] menu, boolean card) {
		int cost = 0;
		cost = menu[0] * 25000 + menu[1] * 15000 + menu[2] * 17000 ;
		
		if(card)
			cost -= (int)(cost * 0.1);
		
		if(cost < 70000)
			cost += (int)(cost * 0.07);
		else if(cost >= 100000)
			cost += (int)(cost * 0.1);
		
		cost += (int)(cost * 0.1);
		
		return cost;
	}
}
