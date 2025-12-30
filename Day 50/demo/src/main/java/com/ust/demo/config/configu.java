package com.ust.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class configu {
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http){
        http.authorizeHttpRequests(authz->
            authz.requestMatchers("/studentList").authenticated()
        .anyRequest().authenticated()
        ).csrf(csrf->csrf.disable())
        .formLogin(f->f.permitAll());


  return http.build();
    }
    @Bean
public UserDetailsService userDetailService(PasswordEncoder encoder){
UserDetails user=User.withUsername("gokul")
.password(encoder.encode("1234"))
.roles("USER")
.build();


UserDetails admin=User.withUsername("gokul1")
.password(encoder.encode("1234"))
.roles("ADMIN")
.build();
  
return new InMemoryUserDetailsManager(user,admin);


}

@Bean
public PasswordEncoder passwordEncoder(){
    return new BCryptPasswordEncoder();
}
}
