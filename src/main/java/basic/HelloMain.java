package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {
	
	public static void main(String[] args) {
		
//		Hello hello = new Hello();
//		hello.printHello();
		
		/* ApplicationContext
		 * 빈을 컨테이너에 로딩하는 시점이 컨텍스트가 시작되기 전에 모든 빈을 미리 로딩하여 빈이 필요할 때 바로 사용할 수 있도록 함 
		 */
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
