package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {
	
	public static void main(String[] args) {
		
//		Hello hello = new Hello();
//		hello.printHello();
		
		ApplicationContext context = new GenericXmlApplicationContext("beanContainer.xml");
		Hello hello1 = (Hello)context.getBean("hello");
		System.out.println(hello1);
		hello1.printHello();
		
		// 인스턴스를 두개 생성되기 떄문에 유니크 하지 않아서 오류
//		Hello hello2 = (Hello)context.getBean(Hello.class);
//		System.out.println(hello2);
//		hello2.printHello();
		
		Hello hello3 = context.getBean("hello",Hello.class);
		System.out.println(hello3);
		hello3.printHello();
		
		Hello hello4 = context.getBean("hello2",Hello.class);
		System.out.println(hello4);
		hello4.printHello();
	}
}
