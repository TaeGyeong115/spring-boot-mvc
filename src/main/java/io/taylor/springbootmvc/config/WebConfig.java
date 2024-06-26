package io.taylor.springbootmvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
// @EnableWebMvc // Web MVC 모든 설정을 제거함
public class WebConfig implements WebMvcConfigurer {

}