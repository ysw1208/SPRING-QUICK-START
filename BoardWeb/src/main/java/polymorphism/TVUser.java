package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext factory = 
		new GenericXmlApplicationContext("applicationContext.xml");
//		BeanFactory factory = new BeanFactory();
//		TV tv = (TV) factory.getBean(args[0]);
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();

	}

}
