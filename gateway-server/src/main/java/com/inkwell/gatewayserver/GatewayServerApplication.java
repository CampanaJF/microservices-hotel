package com.inkwell.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServerApplication.class, args);
	}

//	@Bean
//	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//		return builder.routes()
//				.route(p -> p
//						.path("/applications/apihotel/**")
//						.filters(f -> f.rewritePath("/applications/apihotel/(?<segment>.*)",
//										"/${segment}")
//								.addResponseHeader("X-Response-Time",new Date().toString()))
//						.uri("lb://HOTELS")).
//				route(p -> p
//						.path("/applications/apirooms/**")
//						.filters(f -> f.rewritePath("/applications/apirooms/(?<segment>.*)",
//										"/${segment}")
//								.addResponseHeader("X-Response-Time",new Date().toString()))
//						.uri("lb://ROOMS")).
//				route(p -> p
//						.path("/applications/apireservations/**")
//						.filters(f -> f.rewritePath("/applications/apireservations/(?<segment>.*)",
//										"/${segment}")
//								.addResponseHeader("X-Response-Time",new Date().toString()))
//						.uri("lb://RESERVATIONS")).build();
//	}

}
