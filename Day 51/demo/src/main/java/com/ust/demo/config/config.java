package com.ust.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.ust.demo.service.UserEntityService;

@Configuration
@EnableWebSecurity
public class config {


@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http){
        http.authorizeHttpRequests(authz->
            authz.requestMatchers("/adduser","/userList").hasRole("ADMIN")
          .anyRequest().authenticated()
        )
        .formLogin(form->form.permitAll())
        .csrf(csrf->csrf.disable());
        return http.build();
    }

@Bean
    public UserDetailsService userDetailsService(UserEntityService userEntityService){
      return userEntityService; 
    }
    @Bean
public DaoAuthenticationProvider authenticationprovider(UserDetailsService userDetailsService){
    DaoAuthenticationProvider d = new DaoAuthenticationProvider(userDetailsService);
    d.setPasswordEncoder(passwordEncoder());
    return d;

}
@Bean
public PasswordEncoder passwordEncoder(){
    return new BCryptPasswordEncoder();
}
@Bean
	public AuthenticationManager am(AuthenticationConfiguration config) {
		return config.getAuthenticationManager();
	}
}
