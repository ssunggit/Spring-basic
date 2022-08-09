package di.anno02;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
/*
 * @Autowired
 * -> type을 먼저 찾고 name = tire같은 것을 찾음 @Qualifier
 * @Resource
 * -> name = tire같은 것을 먼저 찾음 -> type
 */

// 전부 빈으로 등록시켜주는 어노테이션, 단 사람들이 볼 때 기능을 알수 있음 
//@Controller
//@Service
//@Repository
//@Component

// 기본 빈 이름 소문자로 클래스 이름 ex) car
// 아래 처럼 이름을 줄 수 있음
@Component("car")
public class Car {
//	@Resource
	//@Qualifier("hankook")
	private Tire tire;
	
	public Car() {
		System.out.println("Car() 생성자 입니다.");
	}
	
	// 생성자 주입
	public Car(Tire tire) {
		
		System.out.println("Car(Tire tire) 생성자 입니다.");
		this.tire = tire;
	}
	
	// @Resource 는 생성자는 안되고 셋터만 가능
	// setter 주입
	// 기본생성자가 생성이 되고 셋터
	// @Autowired
	@Resource
	@Qualifier("hankook")
	public void setTire(Tire tire) {
		System.out.println("setTire(Tire tire) 호출");
		this.tire = tire;
	}

	public void printTireBrand() {
		System.out.println("장착한 타이어 브랜드는 " + tire.getTireBrand());
	}
}
