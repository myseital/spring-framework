package com.mao.app;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author myseital
 * @date 2022/3/13 21:42
 */
@Configurable
@ComponentScan("com.mao") // 从外到里 从上往下一层层扫描
public class AppConfig {

}
