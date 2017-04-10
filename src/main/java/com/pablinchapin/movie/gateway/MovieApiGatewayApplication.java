package com.pablinchapin.movie.gateway;

import com.pablinchapin.movie.gateway.filter.PreFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class MovieApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieApiGatewayApplication.class, args);
	}
        
        
        @Bean
        public PreFilter preFilter(){
            return new PreFilter();
        }
        
}
