package workbook.StepL;

import java.text.SimpleDateFormat;
import java.util.*;

class Parking{
	private int num;
	private String name;
	private String parkingTime;
	private int year, month, day, hour, minute;
	
	Parking(int num, String name, String time[]){
		this.num = num;
		this.name = name;
		year = Integer.parseInt(time[0]);
		month = Integer.parseInt(time[1]);
		day = Integer.parseInt(time[2]);
		hour = Integer.parseInt(time[3]);
		minute = Integer.parseInt(time[4]);
	}
	
	void print(int n) {
		System.out.println("[" + (n + 1) + "번] " + this.num + " " + this.name + " " + year + "-" + month + "-" + day + "-" + hour + "-" + minute);
	}
	int delete(String time[]) {
		int inTime = (year * 12 * 30 * 24 * 60) + (month * 30 * 24 * 60) + (day * 24 * 60) + (hour * 60) + minute;
		int outTime = (Integer.parseInt(time[0]) * 12 * 30 * 24 * 60) + (Integer.parseInt(time[1]) * 30 * 24 * 60) + (Integer.parseInt(time[2]) * 24 * 60) + (Integer.parseInt(time[3]) * 60) + Integer.parseInt(time[4]);
		int charge = 0;
		
		if(outTime - inTime <= 10)
			charge = 0;
		else {
			if((outTime - inTime - 10) / 10 != 0) {
		
				charge = (((outTime - inTime - 10) / 10) + 1) * 500 ;
			}else {
				charge = ((outTime - inTime - 10) / 10) * 500;
			}
		}
		System.out.println("현재 시간은 [" + time[0] + time[1] + time[2] + " " + time[3] + ":" + time[4] + "] 이므로 주차 금액은 " + charge + "원입니다");
		
		return charge;
	}
}

public class L02 {
	Scanner s = new Scanner(System.in);
	ArrayList<Parking> p = new ArrayList<Parking>();
	SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-dd-hh-mm-ss", Locale.KOREA);
	
	private int max_num;
	
	public void main() {
		int menu = 0;
		int current = 0;
		
		System.out.print("주차할 수 있는 차의 개수를 입력하세요: ");
		this.max_num = s.nextInt();
		System.out.println("총 " + max_num + "대를 주차할 수 있습니다");
		
		while(true) {
			menu = printMenu();
			
			switch(menu) {
				case 1:
					if(current == max_num)
						System.out.println("남은 주차 공간이 없습니다!");
					else {
						Add();
						current++;
					}
					break;
				case 2:
					if(current == 0) {
						System.out.println("주차되어 있는 차가 없습니다!");
					}else {
						List();
						Delete();
						current--;
					}
					break;
				case 3:
					List();
					break;
				case 4:
					NumOfList();
					System.out.println("");
					List();
					break;
				case 5:
					System.out.println("주차 가능한 자리는 " +(max_num - current) + "대 입니다");
					break;
				case 6:
					System.out.println("종료되었습니다");
					return;
				default:
					System.out.println("Error : 올바른 값을 입력해주세요!");
					break;
			}
			System.out.println("");
		}
	}
	
	int printMenu() {
		int menu;
		
		System.out.print("------------------------------------\n");
		System.out.print("1)입차 2)출차 3)리스트 4)입차 총 개수 5) 주차 잔여 개수 6)종료 --> ");
		menu = s.nextInt();
		System.out.print("------------------------------------\n");
		
		return menu;
	}
	
	void Add() {
		int num;
		String name;
		String[] time = new String[6];
		
		System.out.print("입차할 차의 번호와 차종을 입력하세요: ");
		num = s.nextInt();
		name = s.next();
		
		String park_time = f.format(new Date());
		time = park_time.split("-");
		
		p.add(new Parking(num, name, time));
		
		System.out.println("[" + p.size() + "번] " + time[0] + "년 " + time[1] + "월 " + time[2] + "일 " + time[3] + "시 " + time[4] + "분 입차 되었습니다");
	}
	
	void List() {
		int size = p.size();
		
		for(int i = 0; i < size; i++) {
			p.get(i).print(i);
		}
	}
	
	void Delete() {
		System.out.print("출차하실 번호를 입력하세요: ");
		int n = s.nextInt();
		String[] time = new String[6];
		String park_time = f.format(new Date());
		time = park_time.split("-");
		
		
		int charge = p.get(n - 1).delete(time);
		p.remove(n - 1);
		
		System.out.println("정산되었습니다");
	}
	
	void NumOfList() {
		System.out.println("총 " + p.size() + "대가 주차되어 있습니다");
	}
}
