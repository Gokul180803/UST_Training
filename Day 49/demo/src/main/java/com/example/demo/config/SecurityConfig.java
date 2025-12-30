package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {


@Bean
    public SecurityFilterChain securityfilterChain(HttpSecurity http){
        http.authorizeHttpRequests(gokul ->

            gokul.requestMatchers("/api/home/**").authenticated()
            .requestMatchers("/").permitAll()
            .anyRequest().permitAll()
        )
        .formLogin(form->form.permitAll())
        ;

       return  http.build();
        
    }
    @Bean
       public UserDetailsService userDetailsService(PasswordEncoder Encoder){
        UserDetails user= User.withUsername("gokul")
        .password(Encoder.encode("gokul123"))
        .roles("USER")
        .build();
          


              UserDetails admin= User.withUsername("gokul1")
        .password(Encoder.encode("gokul123"))
        .roles("ADMIN")
        .build();
          
        return new InMemoryUserDetailsManager(user,admin);


       }

@Bean
 public PasswordEncoder passwordEncoder(){
    return new BCryptPasswordEncoder();
}


}
