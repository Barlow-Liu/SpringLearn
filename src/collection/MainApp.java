package collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	private static final Log log= LogFactory.getLog(MainApp.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("collection/Beans-collection.xml");
		JavaCollection jc = ac.getBean("javaCollection", JavaCollection.class);
		log.info(jc.toString());
	}

}
