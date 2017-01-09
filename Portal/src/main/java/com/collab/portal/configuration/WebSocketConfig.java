package com.collab.portal.configuration;

import org.springframework.context.annotation.*;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.*;

@Configuration
@EnableWebSocketMessageBroker
@ComponentScan(basePackages = "com.collab")
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer{
	
	
	@Override
	 public void configureMessageBroker(MessageBrokerRegistry config) 
	 {
		System.out.println("CONGIGURE MESSAGE BROKER");
	    config.enableSimpleBroker("/topic");
	    config.setApplicationDestinationPrefixes("/app");
	 }
	   
	 public void registerStompEndpoints(StompEndpointRegistry registry) 
	 {
	    registry.addEndpoint("/chat").withSockJS();
	 }
	
	//@Override
	//public void configureMessageBroker(MessageBrokerRegistry messageBrokerRegistry){
		//messageBrokerRegistry.enableSimpleBroker("/topic");
		//messageBrokerRegistry.setApplicationDestinationPrefixes("/app");
	//}
	
	

	//@Override
	//public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
		//stompEndpointRegistry.addEndpoint("/chat").setAllowedOrigins("*").withSockJS();
		
	//}

}
