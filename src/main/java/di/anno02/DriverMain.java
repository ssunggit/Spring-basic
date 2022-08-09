package di.anno02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {
	public static void main(String[] args) {
		/* ApplicationContext
		 * 빈을 컨테이너에 로딩하는 시점이 컨텍스트가 시작되기 전에 모든 빈을 미리 로딩하여 빈이 필요할 때 바로 사용할 수 있도록 함 
		 */
		ApplicationContext context = new GenericXmlApplicationContext("di.anno02.xml");
		System.out.println("--------------------------------------------------------");
		Car car = (Car)context.getBean("car");
		car.printTireBrand();
	}
}
