package com.project.burari.core.config;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	@Override
	public void addCorsMappings(CorsRegistry registry){
		
		InetAddress local;
		String ip = null;
		try {
			local = InetAddress.getLocalHost();
			ip = local.getHostAddress();
		} catch (UnknownHostException e) {
			ip = "localhost";
		}
		
		System.out.println(ip);
		
		registry.addMapping("/**").allowedOrigins("http://" + ip + ":3000");
	}
}
