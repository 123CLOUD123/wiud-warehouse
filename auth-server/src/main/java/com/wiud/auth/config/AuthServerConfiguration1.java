package com.wiud.auth.config;
//package com.wiud.auth.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.OAuth2AuthorizationServerConfiguration;
//import org.springframework.security.oauth2.core.AuthorizationGrantType;
//import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
//import org.springframework.security.oauth2.server.authorization.client.InMemoryRegisteredClientRepository;
//import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
//import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;
//import org.springframework.security.web.DefaultSecurityFilterChain;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//@Import(OAuth2AuthorizationServerConfiguration.class)
//public class AuthServerConfiguration {
//
//	@Bean
//	@Conti
//	public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//		http.authorizeRequests()
//			.anyRequest().authenticated();
//		return http.build();
//	}
//	
//	@Bean
//    public RegisteredClientRepository registeredClientRepository() {
//        RegisteredClient client = RegisteredClient.withId("test_id")
//                .clientId("test_client")
//                .clientSecret("test_secret")
//                .clientAuthenticationMethod(ClientAuthenticationMethod.BASIC)
//                .authorizationGrantTypes(authorizationGrantTypes -> {
//                    authorizationGrantTypes.add(AuthorizationGrantType.AUTHORIZATION_CODE);
//                    authorizationGrantTypes.add(AuthorizationGrantType.REFRESH_TOKEN);
//                })
//                .redirectUri("https://baidu.com")
//                .build();
//        return new InMemoryRegisteredClientRepository(client);
//    }
//	
//}
