package com.privalia.perfiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@Profile("dev")
@PropertySource("classpath:dev.properties")
public class DevEnvConfig {
	
	@Value("${user}" )
	private String user;
	
	@Value("${id_user}" )
	private int id_user;
	
	@Bean
	public User user(){
		return new User(id_user, user);
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer
	propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}	

}
