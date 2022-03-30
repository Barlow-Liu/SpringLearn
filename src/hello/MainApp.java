package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = context.getBean("helloWorld",HelloWorld.class);
        obj.getMessage();


//test
        //test2
        //test3
    }
}
