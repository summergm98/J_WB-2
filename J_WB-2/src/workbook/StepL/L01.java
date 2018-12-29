package workbook.StepL;

import java.util.*;

class Menu{
	private String name;
	private String from;
	private int cost;
	
	Menu(String name, String from, int cost) {
		this.name = name;
		this.from = from;
		this.cost = cost;
	}
	
	void print(int n) {
		System.out.println((n + 1) + " / " + name + " / " + from + " / " + cost);
	}
	
	void replace(String name, String from, int cost) {
		this.name = name;
		this.from = from;
		this.cost = cost;
	}
}

public class L01 {
	private ArrayList<Menu> menu = new ArrayList<Menu>();
	private Scanner s = new Scanner(System.in);

	public void Menu() {
		int menu = 0;
		
		while(true) {
			System.out.print("1) 추가  2) 수정  3) 삭제  4) 리스트  5) 총 개수  6) 종료  --> ");
			menu = s.nextInt();
			System.out.println("-------------------------------------------------");
			
			switch(menu) {
				case 1:
					Add();
					break;
				case 2:
					List();
					Modify();
					break;
				case 3:
					List();
					Delete();
					break;
				case 4:
					List();
					break;
				case 5:
					NumOfList();
					break;
				case 6:
					System.out.println("종료되었습니다");
					return;
				default:
					System.out.println("ERROR : 올바른 값을 입력해 주세요!");
					break;
			}
		}
	}
	
	void Add() {
		String name, from;
		int cost;
		
		System.out.print("메뉴의 메뉴명, 원산지, 가격을 입력하세요: ");
		name = s.next();
		from = s.next();
		cost = s.nextInt();
		
		menu.add(new Menu(name, from, cost));
	}
	
	void Modify() {
		String name, from;
		int cost;
		int num;
		
		System.out.print("수정할 번호를 입력하세요 --> ");
		num = s.nextInt();
		
		System.out.print("메뉴의 메뉴명, 원산지, 가격을 입력하세요: ");
		name = s.next();
		from = s.next();
		cost = s.nextInt();
		
		menu.get(num - 1).replace(name, from, cost);
		
		System.out.println("수정되었습니다");
	}
	void List() {
		System.out.println("메뉴 번호 / 메뉴 이름 / 원산지 / 1인분 가격");
		
		for(int i = 0; i < menu.size(); i++)
			menu.get(i).print(i);
	}
	
	void NumOfList() {
		System.out.println(menu.size() + "개의 메뉴가 등록되어 있습니다");
	}
	
	void Delete() {
		System.out.print("삭제할 번호를 입력하세요 --> ");
		menu.remove(s.nextInt() - 1);
		
		System.out.println("삭제되었습니다");
	}
}
