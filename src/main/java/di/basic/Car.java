package di.basic;

public class Car {
	private HankookTire hankookTire;
	
	public Car() {
		//hankookTire = new HankookTire();
		System.out.println("Car() 생성자 입니다.");
	}
	
	// DI (dependency injection)
	
	// 생성자 주입
	public Car(HankookTire hankookTire) {
		
		System.out.println("Car(HankookTire hankookTire) 생성자 입니다.");
		this.hankookTire = hankookTire;
	}
	
	// setter 주입
	public void setHankookTire(HankookTire hankookTire) {
		this.hankookTire = hankookTire;
	}

	public void printTireBrand() {
		System.out.println("장착한 타이어 브랜드는 " + hankookTire.getTireBrand());
	}
	
}
