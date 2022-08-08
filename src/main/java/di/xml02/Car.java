package di.xml02;

import java.util.List;

public class Car {
	
	private Tire tire;
	private String msg;
	private String error;
	private int num;
	private List<String> list;
	
	
	public Car() {
		System.out.println("Car() 생성자 입니다.");
	}
	
	// 생성자 주입
	public Car(Tire tire) {
		System.out.println("Car(Tire tire) 생성자 입니다.");
		this.tire = tire;
	}
	
	// 생성자 
	public Car(Tire tire, String msg) {
		System.out.println("Car(Tire tire, String msg) 생성자 입니다.");
		this.tire = tire;
		this.msg = msg;	
	}
	
	public Car(String error, Tire tire) {
		System.out.println("Car(String error, Tire tire) 생성자 입니다.");
		this.error = error;	
		this.tire = tire;
	}
	
	public Car(int num, String msg) {
		System.out.println("Car(int num, String msg) 생성자 입니다.");
		this.num = num;	
		this.msg = msg;	
	}
	
	public Car(List<String> list) {
		System.out.println("Car(List<String> list) 생성자 입니다.");
		this.list = list;	
	}
	
	// setter 주입
	public void setTire(Tire tire) {
		this.tire = tire;
	}

	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	
	
	public void printTireBrand() {
		System.out.println("장착한 타이어 브랜드는 " + tire.getTireBrand());
		
	}
	
	public void printMsg() {
		System.out.println("msg : " + msg);
	}
	
	public void printNum() {
		System.out.println("num : " + num);
	}
	
	public void printList() {
		if(list != null) {
			for(String item : list) {
				System.out.println(item);
			}
		}
	}
	
}
