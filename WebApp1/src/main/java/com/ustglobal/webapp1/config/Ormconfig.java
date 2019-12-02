package com.ustglobal.webapp1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class Ormconfig {
@Bean
public LocalEntityManagerFactoryBean getBean() {
	LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();
	bean.setPersistenceUnitName("Retailer-unit");
	return bean;
}
}
