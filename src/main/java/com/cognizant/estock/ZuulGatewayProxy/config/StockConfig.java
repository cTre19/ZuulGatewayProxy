//package com.cognizant.estock.ZuulGatewayProxy.config;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class StockConfig {
//
//    @Bean
//    public RouteLocator stockRouteConfig(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(r -> r.path("/api/v1.0/market/stock/**")
//                        .uri("http://localhost:8082"))
//                .route(r -> r.path("/api/v1.0/market/company/**")
//                        .uri("http://localhost:8081"))
//                .build();
//    }
//}
