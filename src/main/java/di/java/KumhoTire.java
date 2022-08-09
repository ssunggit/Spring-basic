package di.java;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class KumhoTire implements Tire {

	public KumhoTire() {
		System.out.println("KumhoTire() 생성자");
	}
	
	public String getTireBrand() {
		// TODO Auto-generated method stub
		return "금호타이어";
	}

}
