//package com.jrishmani.twiliosms.config;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.messaging.simp.SimpMessagingTemplate;
//import org.springframework.messaging.simp.config.MessageBrokerRegistry;
//import org.springframework.web.socket.config.annotation.EnableWebSocket;
//import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
//import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
//import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
//
//@Configuration
//@EnableWebSocket
//@EnableWebSocketMessageBroker
//public class WebsocketConfig implements WebSocketMessageBrokerConfigurer {
//
//  public void configurationMessageBroker(MessageBrokerRegistry config){
//        config.enableSimpleBroker("/topic");
//        config.setApplicationDestinationPrefixes("/app");
//    }
//    public void registerStompEndPoints(StompEndpointRegistry registry){
//        registry.addEndpoint("/gs-guide-websocket").withSockJS();
//    }
//
//}
