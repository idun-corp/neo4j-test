package com.proptechos.neo4j.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class InternalAuthFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        UserPrincipal principal = UserPrincipal.authenticated();

        //Granting authorities
        List<SimpleGrantedAuthority> grantedAuthorities = principal.getRoles().stream()
            .map(SimpleGrantedAuthority::new)
            .collect(Collectors.toList());

        final PreAuthenticatedAuthenticationToken authentication =
            new PreAuthenticatedAuthenticationToken(principal, null, grantedAuthorities);
        authentication.setAuthenticated(!grantedAuthorities.isEmpty());
        authentication.setDetails(principal);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        filterChain.doFilter(request, response);
    }
}
