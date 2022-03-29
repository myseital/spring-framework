package com.mao.test;


import com.mao.app.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

/**
 * @author myseital
 * @date 2022/3/13 21:43
 */
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		//注入外部bean到spring  1 @Bean 2 实现FactoryBean 3. ApplicationContext注册
		ac.getBean(TestService.class);
	}


}
