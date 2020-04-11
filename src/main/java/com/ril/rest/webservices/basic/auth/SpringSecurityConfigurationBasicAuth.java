package com.ril.rest.webservices.basic.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfigurationBasicAuth extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		super.configure(auth);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		// allow preflight request to all the requests to any url (options we see in the
		// browser)
		// means except options request auhenticate all other requests
		http.csrf().disable().authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/**").permitAll().anyRequest()
				.authenticated().and().formLogin().and().httpBasic();
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		// TODO Auto-generated method stub
		super.configure(web);
	}

}
