/*package com.SpringApp3WithSpringSecurity.SpringApp3WithSpringSecurity.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class BookSecurity {
    @Bean
    public InMemoryUserDetailsManager createUser()
    {
        UserDetails User1 =User.builder().username("Neha").password("{noop}Neha@123").build();
        return new InMemoryUserDetailsManager(User1);
    }
}*/
