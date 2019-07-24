package rhb.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class SpringUtils implements ApplicationContextAware {

	private static ApplicationContext context; 
	
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}
	
	public static ApplicationContext getApplicationContext() {
		return context;
	}
	
	public static <T> T getBean(Class<T> cla) {
		checkApplicationContext();
		return context.getBean(cla);
	}
	
	public static <T> T getBean(String name) {
		checkApplicationContext();
		return (T) context.getBean(name);
	}
	
	public static void cleanApplicationContext() {
		context = null;
	}
	
	public static void checkApplicationContext() {
		Assert.notNull(context, "current applicationcontext is null!");
	}

}
