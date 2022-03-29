package com.mao.service;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author myseital
 * @date 2022/3/14 23:27
 */
public class MFactoryBean implements FactoryBean {

	@Override
	public Object getObject() throws Exception {
		return null;
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
