package di.xml01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class DriverMain {
	
	public static void main(String[] args) {
	
		ApplicationContext context = new GenericXmlApplicationContext("di.xml01.xml"); 
		
		Car car = (Car)context.getBean("car");
		
		Tire hankook = context.getBean(HankookTire.class);
		
		
		Tire kumho = context.getBean("kumho100",KumhoTire.class);
		
		car.setTire(hankook);
		car.printTireBrand();
		
	}
}
