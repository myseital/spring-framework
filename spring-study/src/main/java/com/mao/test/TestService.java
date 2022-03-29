package com.mao.test;

import com.mao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author myseital
 * @date 2022/3/13 21:50
 */
@Service
public class TestService {

	@Autowired
	public UserService userService;
}
