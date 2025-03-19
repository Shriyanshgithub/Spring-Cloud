package com.capgemini.Spring_Security_HandsOn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/sayHello").permitAll()
                        .anyRequest().authenticated())
                .formLogin(Customizer.withDefaults())//enable UserNamePasswordAuthenticationFilter
                .httpBasic(Customizer.withDefaults());//enable BasicAuthenticationFilter

        return http.build();

    }
}
