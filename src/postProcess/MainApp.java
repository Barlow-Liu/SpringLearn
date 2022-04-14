package postProcess;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
	private static final Log LOGGER = LogFactory.getLog(MainApp.class);
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("postProcess/Beans-postProcess.xml");

		PostProcess postProcess= context.getBean("postProcess",PostProcess.class);
        postProcess.getMessage();
        context.registerShutdownHook();

	}

}
