package com.zup.ottransacao.security;


import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    //Aqui eu defino se o usuário tem prerrogativas para ver a própria fatura
    //No controller, vou verificar se, além de poder consultar a faturas, o usuário logado é
    //titular da fatura que tenta acessar
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests(authorizeRequest ->
                        authorizeRequest
                                .antMatchers(HttpMethod.GET, "/transacoes/*").hasAuthority("transacao-view-list")
                                .anyRequest().authenticated()
                )
                .oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt);
    }

}
