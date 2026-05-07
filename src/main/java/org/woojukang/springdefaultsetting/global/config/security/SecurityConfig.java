package org.woojukang.springdefaultsetting.global.config.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(
            AuthenticationConfiguration authenticationConfiguration)
            throws Exception {

        return authenticationConfiguration.getAuthenticationManager();
    }

    public SecurityFilterChain securityFilterChain
            (HttpSecurity httpSecurity)
            throws Exception{

        httpSecurity
                .csrf(AbstractHttpConfigurer::disable);

        httpSecurity
                .formLogin(AbstractHttpConfigurer::disable);

        httpSecurity
                .httpBasic(AbstractHttpConfigurer::disable);
        httpSecurity
                .cors(Customizer.withDefaults());
        httpSecurity
                .sessionManagement((session)->session
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        httpSecurity
                .authorizeHttpRequests((auth)->auth
                        .requestMatchers("/login","/api/v1/user/create").permitAll()
                        .anyRequest().authenticated()
                );

        return httpSecurity.build();
    }
}
