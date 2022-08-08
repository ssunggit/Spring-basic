package di.basic2;

public class DriverMain {
	
	public static void main(String[] args) {
	
		// DI 를 쓸때 코드를 유연하게 쓰고싶으면 인터페이스를 상속받아서 하도록 한다.
		// 유지보수가 편하다.
		
		Tire hankook = new HankookTire();
		Tire kumho = new KumhoTire();
		
		Car car = new Car();
		car.setTire(hankook);
		
		car.printTireBrand();
		
	}
}
