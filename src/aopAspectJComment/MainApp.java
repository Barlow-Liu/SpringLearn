package aopAspectJComment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import aopAspectJComment.dao.UserDao;
import aopAspectJComment.dao.config.AppConfig;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
		UserDao userDao = context2.getBean("userDao", UserDao.class);
		userDao.add();
		userDao.modify();
		userDao.delete();
		userDao.get();
	}

}
