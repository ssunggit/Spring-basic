package di.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("car")
public class Car {
	
	@Autowired
	@Qualifier("hankookTire")
	private Tire tire;
	
	public Car() {
		System.out.println("Car() 생성자 입니다.");
	}
	
	// 생성자 주입
	@Autowired
	public Car(@Qualifier("hankookTire") Tire tire) {
		
		System.out.println("Car(Tire tire) 생성자 입니다.");
		this.tire = tire;
	}
	
	// setter 주입
	public void setTire(Tire tire) {
		this.tire = tire;
	}

	public void printTireBrand() {
		System.out.println("장착한 타이어 브랜드는 " + tire.getTireBrand());
	}
}
