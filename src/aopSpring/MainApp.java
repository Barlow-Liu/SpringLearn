package aopSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aopSpring.dao.UserDao;
import aopSpring.pointCutAdvice.dao.OrderDao;

public class MainApp {
	public static void main(String[] args) {
		// 获取 ApplicationContext 容器
		ApplicationContext context = new ClassPathXmlApplicationContext("aopSpring/Beans-aopSpring.xml");
		// 获取代理对象
		UserDao userDao = context.getBean("userDaoProxy", UserDao.class);
		// 调用 UserDao 中的各个方法
		userDao.add();
		userDao.delete();
		userDao.get();
		userDao.modify();

		//orderDaoProxy
		OrderDao orderDao =context.getBean("orderDaoProxy", OrderDao.class);
		orderDao.add();
		orderDao.adds();
		orderDao.delete();
		orderDao.modify();

	}
}
