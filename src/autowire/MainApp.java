package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire/Beans-autowire.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
	}

}
