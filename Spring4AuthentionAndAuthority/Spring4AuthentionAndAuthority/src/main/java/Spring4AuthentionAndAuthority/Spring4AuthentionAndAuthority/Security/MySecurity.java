package Spring4AuthentionAndAuthority.Spring4AuthentionAndAuthority.Security;

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
        UserDetails admin=User.builder().username("Admin").password("{noop}Admin@123").roles("ADMIN","HR").build();
        UserDetails hr=User.builder().username("Hr").password("{noop}Hr@123").roles("HR").build();
        return new InMemoryUserDetailsManager(admin,hr);
    }
    //-----------------------------------------------------------------------------------------------------
    @Bean
    public DefaultSecurityFilterChain auth(HttpSecurity http) throws Exception
    {
        http.authorizeHttpRequests(config->config

                        .requestMatchers("/hrLogin").hasRole("HR")
                        .requestMatchers("/adminLogin").hasRole("ADMIN")
                        .anyRequest().authenticated())
                .formLogin(Customizer.withDefaults()).exceptionHandling(config->config.accessDeniedPage("/access-denied"));
         return http.build();
    }
    //--------------------------------------------------------------------------------------------------------------

}
