package log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	private static final Logger log = LoggerFactory.getLogger(MainApp.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("log4j/Beans.xml");
        log.info("正在从容器中获取 HelloLog4j 的 Bean");
        HelloLog4j obj = context.getBean("helloLog4j", HelloLog4j.class);
        obj.getMessage();
        log.info("代码执行完成！");
	}

}
