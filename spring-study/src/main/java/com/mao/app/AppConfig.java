package com.mao.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author myseital
 * @date 2022/3/13 21:42
 */
@Configurable
@ComponentScan("com.mao") // 从外到里 从上往下一层层扫描
public class AppConfig {

	/**
	 * 监听器启动配置自定义线程池
	 */
	@Bean("applicationEventMulticaster")
	public SimpleApplicationEventMulticaster simpleApplicationEventMulticaster(
			BeanFactory beanFactory, Executor taskExecutor) {
		SimpleApplicationEventMulticaster multicaster = new SimpleApplicationEventMulticaster(beanFactory);
		multicaster.setTaskExecutor(taskExecutor);

		return multicaster;
	}

	@Bean
	public ThreadPoolTaskExecutor poolTaskExecutor() {
		ThreadPoolTaskExecutor poolTaskExecutor = new ThreadPoolTaskExecutor();
		poolTaskExecutor.setCorePoolSize(3);
		poolTaskExecutor.setMaxPoolSize(5);
		poolTaskExecutor.setQueueCapacity(10);
		poolTaskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
		poolTaskExecutor.initialize();

		return poolTaskExecutor;
	}
}
