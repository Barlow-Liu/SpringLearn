package aopSpring.pointCutAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aopSpring.pointCutAdvice.dao.OrderDao;

public class MainApp {
	public static void main(String[] args) {
		// 获取 ApplicationContext 容器
		ApplicationContext context = new ClassPathXmlApplicationContext("aopSpring/Beans-aopSpring.xml");
		// 获取代理对象
		OrderDao orderDao = context.getBean("orderDaoProxy", OrderDao.class);
		// 调用 OrderDao 中的各个方法
		orderDao.add();
		orderDao.adds();
		orderDao.delete();
		orderDao.get();
		orderDao.modify();
	}
}
