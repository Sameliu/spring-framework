package org.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author siming.liu@ttpai.cn
 * @Date 2019/8/6 9:30
 */
public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Person bean = classPathXmlApplicationContext.getBean(Person.class);
		System.out.println(bean);
	}
}
