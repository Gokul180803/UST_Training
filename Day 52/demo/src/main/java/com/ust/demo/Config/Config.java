package com.ust.demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.ust.demo.service.customuser;

@Configuration
public class Config {


@Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http){
               http.authorizeHttpRequests(authz->
                    authz.requestMatchers("/finduser").authenticated()
                    .anyRequest().authenticated()



               )
               //.httpBasic(Customizer.withDefaults())
            .formLogin(form->form.permitAll())
               .csrf(csrf->csrf.disable());
        return http.build();
    }

@Bean
    public UserDetailsService userdetailService(){
        return new customuser();
    }
 @Bean
public DaoAuthenticationProvider authenticationprovider(){
    DaoAuthenticationProvider dao=new DaoAuthenticationProvider(userdetailService());
    dao.setPasswordEncoder(passwordEncoder());
    return dao;
}

@Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
