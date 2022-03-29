package com.mao.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author myseital
 * @date 2022/3/14 23:16
 */
@Component
@Lazy // getBean时候初始化
public class AppService {

	public AppService() {
		System.out.println("Constructor AppService");
	}
}
