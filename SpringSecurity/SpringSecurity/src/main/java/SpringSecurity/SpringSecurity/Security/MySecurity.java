package SpringSecurity.SpringSecurity.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class MySecurity {   //bydefault username will be=User and Password generate on console
    @Bean
    public InMemoryUserDetailsManager createUser()
    {
        UserDetails Aaku =User.builder().username("Aaku").password("{noop}Aaku@123").build();
        return new InMemoryUserDetailsManager(Aaku);
    }
}
