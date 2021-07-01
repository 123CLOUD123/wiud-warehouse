package com.wiud.auth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
	
    @Override
    public void configure(WebSecurity web) throws Exception {
    	web.ignoring().antMatchers("/css/**");
    	web.ignoring().antMatchers("/img/**");
    }
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.passwordEncoder(NoOpPasswordEncoder.getInstance())
			.withUser("test")
			.password("test")
			.roles("ADMIN");
	}
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
		http.headers().frameOptions().disable()
			.and().csrf().disable()
			.cors().disable()
			.httpBasic().disable()
			.authorizeRequests()
			.antMatchers("/test/**").permitAll()
			.anyRequest().authenticated()
			.and().formLogin()
			.and().logout()
				.logoutUrl("/oauth/logout")
				.logoutSuccessUrl("/login")
				.deleteCookies("JSESSIONID")
				.invalidateHttpSession(true)
				.clearAuthentication(true);
    }

}
