package workbook.StepL;

import java.util.*;

class Manage{
	private String name;
	private int num;
	private String gender;
	private String address;
	private String phone_num;
	private String re;
	
	public Manage(String name, int num, String gender, String address, String phone, String re) {
		this.name = name;
		this.num = num;
		this.gender = gender;
		this.address = address;
		this.phone_num = phone;
		this.re = re;
	}
	
	public void print(int i) {
		System.out.println("[" + (i + 1) + "] " + name + " / " + num + " / " + gender + " / " + address + " / " + phone_num + " / " + re);
	}

	public void replace(String name, int num, String gender, String address, String phone, String re) {
		this.name = name;
		this.num = num;
		this.gender = gender;
		this.address = address;
		this.phone_num = phone;
		this.re = re;
	}
	
	String getName() {
		return name;
	}
	
	String getRe() {
		return re;
	}
	
	String getAddress() {
		return address;
	}
}

public class L04 {
	Scanner s = new Scanner(System.in);
	ArrayList<Manage> m = new ArrayList<Manage>();
	
	int total = 0;
	
	public void main() {
		int menu = 0;
		
		while(true) {
			menu = getMenu();
			
			switch(menu) {
				case 1:
					getStudent();
					break;
				case 2:
					if(total == 0)
						System.out.println("입력된 학생이 없습니다!\n");
					else {
						List();
						edit();
					}
					break;
				case 3:
					if(total == 0)
						System.out.println("입력된 학생이 없습니다!\n");
					else {
						List();
						Delete();
						total--;
					}
					break;
				case 4:
					if(total == 0)
						System.out.println("입력된 학생이 없습니다!\n");
					else
					List();
					break;
				case 5:
					Search_Name();
					break;
				case 6:
					List_re();
					break;
				case 7:
					Search_Address();
					break;
				case 8:
					System.out.println("종료되었습니다");
					return;
				default:
					System.out.println("Error : 올바른 메뉴 번호를 입력하세요");
					break;
			}
		}
	}
	
	int getMenu() {
		int menu = 0;
		
		System.out.print("------------------------원하는 메뉴의 번호를 입력하세요------------------------\n");
		System.out.print("1)학생등록  2)정보수정  3)삭제  4)리스트  5)이름검색  6)복학생리스트  7)주소검색  8)종료 --> ");
		menu = s.nextInt();
		System.out.print("--------------------------------------------------------------------\n");
		
		return menu;
	}
	
	void getStudent() {
		String name, address, re, gender, phone;
		int num;
		
		System.out.print("학생 이름, 학번, 성별(M / W)을 입력하세요: ");
		name = s.next();
		num = s.nextInt();
		gender = s.next();
		
		System.out.print("주소를 입력하세요: ");
		s.nextLine();
		address = s.nextLine();
		
		System.out.print("전화번호를 입력하세요: ");
		phone = s.next();
		
		System.out.print("복학생입니까(Y / N)? ");
		re = s.next();
		
		m.add(new Manage(name, num, gender, address, phone, re));
		total++;
		
		System.out.println("총 " + total + "명이 등록되었습니다.\n");
	}
	
	void List() {
		System.out.println("번호 / 이름 / 학번 / 성별 / 주소 / 전화번호 / 복학생");
		
		for(int i = 0; i < m.size(); i++)
			m.get(i).print(i);
		
		System.out.println("");
	}
	
	void List_re() {
		int total_re = 0;
		
		System.out.println("번호 / 이름 / 학번 / 성별 / 주소 / 전화번호 / 복학생");
		
		for(int i = 0; i < m.size(); i++) {
			if(m.get(i).getRe().compareToIgnoreCase("Y") == 0) {
				m.get(i).print(i);
				total_re++;
			}
		}
		System.out.println("복학생은 " + total_re + "명 입니다 \n");
	}
	void Delete() {
		System.out.print("--> 삭제할 번호를 입력하세요: ");
		int del = s.nextInt();
		
		System.out.print("정말로 삭제하시겠습니까? (Y / N) ");
		if(s.next().compareToIgnoreCase("Y") == 0) {
			System.out.println("--> 삭제되었습니다");
			m.remove(del - 1);
		}else
			System.out.println("--> 취소되었습니다");
	}	
	
	void edit() {
		System.out.print("--> 수정할 번호를 입력하세요: ");
		int st_num = s.nextInt();
		
		String name, address, re, gender, phone;
		int num;
		
		System.out.print("학생 이름, 학번, 성별(M / W)을 입력하세요: ");
		name = s.next();
		num = s.nextInt();
		gender = s.next();
		
		System.out.print("주소를 입력하세요: ");
		s.nextLine();
		address = s.nextLine();
		
		System.out.print("전화번호를 입력하세요: ");
		phone = s.next();
		
		System.out.print("복학생입니까(Y / N)? ");
		re = s.next();
		
		m.get(st_num - 1).replace(name, num, gender, address, phone, re);
		
		System.out.println("--> 수정되었습니다");
	}
	
	void Search_Name() {
		String search;
		System.out.print("검색하실 이름을 입력하세요: ");
		s.nextLine();
		search = s.nextLine();
		
		for(int i = 0; i < m.size(); i++) {
			if(m.get(i).getName().contains(search)) {
				System.out.println("검색되었습니다");
				m.get(i).print(i);
			}
		}
		System.out.println("");
	}
	
	void Search_Address() {
		String search;
		System.out.print("검색하실 이름을 입력하세요: ");
		s.nextLine();
		search = s.nextLine();
		
		for(int i = 0; i < m.size(); i++) {
			if(m.get(i).getAddress().contains(search)) {
				System.out.println("검색되었습니다");
				m.get(i).print(i);
			}
		}
		System.out.println("");
	}
}
