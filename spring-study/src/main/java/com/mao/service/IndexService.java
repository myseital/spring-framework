package com.mao.service;

import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author myseital
 * @date 2022/3/14 23:16
 */
@Component
@DependsOn("userService")
public class IndexService {

	public IndexService() {
		System.out.println("Constructor IndexService");
	}
}
