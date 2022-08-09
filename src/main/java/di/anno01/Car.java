package di.anno01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	//@Autowired
	//@Qualifier("hankook")
	private Tire tire;
	
	//@Autowired
	public Car() {
		System.out.println("Car() 생성자 입니다.");
	}
	
	// 생성자 주입
	@Autowired
	public Car(@Qualifier("kumho") Tire tire) {
		System.out.println("Car(Tire tire) 생성자 입니다.");
		System.out.println("Car(Tire tire) 생성자 : "+tire.getTireBrand());
		this.tire = tire;
	}
	
	// setter 주입
	// 기본생성자가 생성이 되고 셋터
	@Autowired
	@Qualifier("hankook")
	public void setTire(Tire tire) {
		System.out.println("setTire(Tire tire) 호출");
		this.tire = tire;
	}

	public void printTireBrand() {
		System.out.println("장착한 타이어 브랜드는 " + tire.getTireBrand());
	}
}
