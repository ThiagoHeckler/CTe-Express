package com.cte.emissor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class SecurityConfig {
/*
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests()  // Método para configurar as permissões nas versões mais recentes
                .anyRequest().permitAll()  // Permite todas as requisições sem autenticação
            .and()
            .csrf().disable()  // Desabilita CSRF, se necessário
            .formLogin().disable()  // Desabilita o login baseado em formulário
            .httpBasic().disable();  // Desabilita a autenticação HTTP básica

        return http.build();
    }*/
}
