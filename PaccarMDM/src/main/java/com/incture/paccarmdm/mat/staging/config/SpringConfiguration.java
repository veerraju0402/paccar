package com.incture.paccarmdm.mat.staging.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableTransactionManagement
@EnableWebMvc
@ComponentScan(basePackages= "com.incture.paccarmdm.mat")    
//searches for package,if a class is out of package


//similar to webApp
public class SpringConfiguration {

}
