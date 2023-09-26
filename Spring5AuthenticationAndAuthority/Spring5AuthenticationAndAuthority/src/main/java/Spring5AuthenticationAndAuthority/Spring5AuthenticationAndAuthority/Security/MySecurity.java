package Spring5AuthenticationAndAuthority.Spring5AuthenticationAndAuthority.Security;

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
        UserDetails admin =User.builder().username("Admin").password("{noop}Admin@123").roles("ADMIN","HR","TRACKER","TRAINER").build();
        UserDetails hr=User.builder().username("Hr").password("{noop}Hr@123").roles("HR").build();
        UserDetails tracker=User.builder().username("Tracker").password("{noop}Tracker@123").roles("TRACKER").build();
        UserDetails trainer=User.builder().username("Trainer").password("{noop}Trainer@123").roles("TRAINER","ADMIN").build();
        return new InMemoryUserDetailsManager(admin,hr,tracker,trainer);
    }
    //---------------------------------------------------------------------------------------------------------------------------
    @Bean
    public DefaultSecurityFilterChain authorization(HttpSecurity http) throws Exception
    {
        http.authorizeHttpRequests(config->config.requestMatchers("/adminLogin").hasRole("ADMIN")
                                                .requestMatchers("/hrLogin").hasRole("HR")
                                                .requestMatchers("/trackerLogin").hasRole("TRACKER")
                                                .requestMatchers("/trainerLogin").hasRole("TRAINER")
                                                .anyRequest().authenticated()).formLogin(Customizer.withDefaults())
                                                .exceptionHandling(config->config.accessDeniedPage("/access-denied"));
        return http.build();
    }
    //-----------------------------------------------------------------------------------------------------------------------------
}
