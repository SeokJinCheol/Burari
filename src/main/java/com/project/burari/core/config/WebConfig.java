package com.project.burari.core.config;

import java.net.InetAddress;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	String ip;
	
	@Override
	public void addCorsMappings(CorsRegistry registry){

		
		registry.addMapping("/**").allowedOrigins("http://"+ this.ip +":8080", "http://" + this.ip + ":3000").allowedOrigins("http://localhost:8080", "http://localhost:3000");
	}
	
	public void returnIP() throws Exception{
		InetAddress local = InetAddress.getLocalHost();
		this.ip = local.getHostAddress();
	}
}
