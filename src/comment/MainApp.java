package comment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import comment.controller.UserController;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("comment/Beans-comment.xml");
		UserController uc = context.getBean("userController",UserController.class);
		uc.doStr();
	}

}
