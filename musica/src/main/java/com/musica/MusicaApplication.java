package com.musica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class MusicaApplication implements WebMvcConfigurer {
  public static void main(String[] args) {
    SpringApplication.run(MusicaApplication.class, args);

  }

//  @Bean
//  public WebMvcConfigurer corsConfigurer() {
//    return new WebMvcConfigurer() {
//      @Override
//      public void addCorsMappings(CorsRegistry registry) {
//        registry
//          .addMapping("/**")
//          .allowedOrigins("http://localhost:4200")
//          .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH");
//      }
//    };
//  }
}
