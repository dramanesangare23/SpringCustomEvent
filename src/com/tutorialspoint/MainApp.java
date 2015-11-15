package com.tutorialspoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		
		CustomEventPublisher customEventPublisher = (CustomEventPublisher)configurableApplicationContext.getBean("customEventPublisher");
		customEventPublisher.publish();
		customEventPublisher.publish();
		
		configurableApplicationContext.close();
	}

}
