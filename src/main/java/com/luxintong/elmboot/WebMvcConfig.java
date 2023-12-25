package com.luxintong.elmboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot
 * @className: WebMvcConfig
 * @author: Lu Xintong
 * @description <p>WebMvcConfig</p>
 * @date: 2023-12-25 18:14
 * @version: 1.0
 */
@Configuration
public class WebMvcConfig {
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				/*
				 * addMapping: 配置可以被跨域的路径, 可以任意配置, 可以具体到直接请求路径。
				 * allowedMethods: 允许请求的方式, 如: POST、GET、PUT、DELETE 等。
				 * allowedOrigins: 允许访问的 url, 可以固定单条或者多条内容，如: "http://www.baidu.com"。
				 * allowedHeaders: 允许的请求 header, 可以自定义设置任意请求头信息。
				 * maxAge: 配置预检请求的有效时间
				 * */
				registry.addMapping("/**")
						.allowedOrigins("http://localhost:8081")
						.allowCredentials(true)
						.allowedMethods("GET", "POST", "DELETE", "PUT", "PATCH")
						.allowedHeaders("*")
						.maxAge(36000);
			}
		};
	}
}
