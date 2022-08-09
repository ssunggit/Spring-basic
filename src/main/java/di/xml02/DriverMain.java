package di.xml02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class DriverMain {
	
	public static void main(String[] args) {
	
		ApplicationContext context = new GenericXmlApplicationContext("di.xml02.xml"); 
		
		System.out.println("----------------1-------------------");
		
		Car car = (Car)context.getBean("car");
		car.printTireBrand();
	
		System.out.println("----------------2-------------------");
		
		Car car2 = (Car)context.getBean("car2");
		car2.printTireBrand();
		car2.printMsg();
		
		System.out.println("-----------------3------------------");

		Car car3 = (Car)context.getBean("car3");
		car3.printMsg();
		car3.printNum();
		
		System.out.println("-----------------4------------------");
		
		Car car4 = (Car)context.getBean("car4");
		car4.printList();
		
		System.out.println("----------- 5 Setter 주입  ------------");
		
		Car car5 = (Car)context.getBean("car5");
		car5.printTireBrand();
		car5.printMsg();
		car5.printNum();
	}
}
