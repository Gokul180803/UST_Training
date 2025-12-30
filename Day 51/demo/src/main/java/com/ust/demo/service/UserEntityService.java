package com.ust.demo.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ust.demo.repository.UserEntityRepository;
import com.ust.demo.userEntity.user;

@Service
public class UserEntityService implements  UserDetailsService{
@Autowired
private UserEntityRepository ur;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
         
  user u=ur.findByUserName(username).orElseThrow(()->new UsernameNotFoundException("user not found"));
//   String str=u.getRoles();
//   String a[]=str.split(",");
//   List<GrantedAuthority> list=new ArrayList<>() ;


//   for(String x:a){
//     SimpleGrantedAuthority s=new SimpleGrantedAuthority(x);
//     list.add(s);
//   }


     return User.builder()
                .username(u.getUsername())
                .password(u.getPassword())
                .authorities(Arrays.stream(u.getRoles().split(","))
                        .map(SimpleGrantedAuthority::new)
                        .toList())
                .build();
    }

}
