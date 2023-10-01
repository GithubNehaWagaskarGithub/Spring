package com.ProductSimulatory.ProductSimulatory.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.DefaultSecurityFilterChain;

@Configuration
public class MySecurity {
    @Bean
    public InMemoryUserDetailsManager createUser()
    {
        UserDetails admin=User.builder().username("Chetan").password("{noop}Chetan@123").roles("ADMIN","ENDUSER").build();
        UserDetails endUser=User.builder().username("Neha").password("{noop}Neha@123").roles("ENDUSER").build();
        return new InMemoryUserDetailsManager(admin,endUser);
    }
    //-----------------------------------------------------------------------------------------------------------------------
    @Bean
    public DefaultSecurityFilterChain auth(HttpSecurity http) throws Exception
    {
        http.authorizeHttpRequests(config-> config
                        .requestMatchers("/userDisplayData").hasRole("ENDUSER")
                        .requestMatchers("/adminDisplayData").hasRole("ADMIN")
                        .anyRequest().authenticated()).formLogin(Customizer.withDefaults())
                .exceptionHandling(config-> config.accessDeniedPage("/noaccess"));
        return http.build();
    }
}
