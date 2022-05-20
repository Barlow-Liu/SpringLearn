package aopAspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aopAspectJ.dao.OrderDao;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/aopAspectJ/Beans.xml");
		OrderDao orderDao = context.getBean("orderDao", OrderDao.class);
		orderDao.add();
		orderDao.delete();

		orderDao.modify();
		orderDao.get();

	}
}
