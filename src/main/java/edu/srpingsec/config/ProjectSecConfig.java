package edu.srpingsec.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        //TODO : Should implement CSRF configurations and CROS
        http.csrf((csrf) -> csrf.disable())
                .authorizeHttpRequests((requests) -> requests
//                        .requestMatchers("/user/log").hasAuthority("VIEWACCOUNT") //TODO : This can be implemented when the dashboard is connected
                        .requestMatchers("/new-user").authenticated() //authenticating this path
                        .requestMatchers("/register").permitAll()) //allowing access to this without authenticating
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
