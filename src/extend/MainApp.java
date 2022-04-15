package extend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("extend/Beans-extend.xml");
		Dog dog = context.getBean("dog", Dog.class);
		System.out.println(dog);

	}

}
