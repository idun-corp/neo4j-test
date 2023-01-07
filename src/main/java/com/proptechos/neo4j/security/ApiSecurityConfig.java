package com.proptechos.neo4j.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class ApiSecurityConfig {

    private static final String[] AUTH_WHITELIST = {
        "/graphiql", "/graphiql/**"
    };

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http,
                                           InternalAuthFilter internalAuthFilter) throws Exception {
        return http.addFilterBefore(internalAuthFilter, UsernamePasswordAuthenticationFilter.class)
            .cors()
            .and()
            .csrf()
            .disable()
            .sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
            .authorizeHttpRequests()
            .requestMatchers(HttpMethod.OPTIONS)
            .permitAll()
            .requestMatchers(AUTH_WHITELIST)
            .permitAll()
            .and()
            .authorizeHttpRequests((authorizeRequests) ->
                authorizeRequests.anyRequest().authenticated())
            .headers()
            .frameOptions()
            .sameOrigin().and().build();
    }
}
