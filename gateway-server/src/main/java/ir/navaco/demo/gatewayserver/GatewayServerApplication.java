package ir.navaco.demo.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class GatewayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServerApplication.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("uiserver", r -> r.path("/ui/**")
                        .filters(f -> f.rewritePath("/ui/(?<segment>.*)", "/${segment}"))
                        .uri("lb://uiserver"))
                .route("cifservice", r -> r.path("/cif/**")
                        .filters(f -> f.rewritePath("/cif/(?<segma>.*)", "/${segma}"))
                        .uri("lb://cifservice"))
                .route("lendingservice", r -> r.path("/lending/**")
                        .filters(f -> f.rewritePath("/lending/(?<segma>.*)", "/${segma}"))
                        .uri("lb://lendingservice"))
                .route("treasuaryservice", r -> r.path("/treasury/**")
                        .filters(f -> f.rewritePath("/treasury/(?<segma>.*)", "/${segma}"))
                        .uri("lb://treasuaryservice"))
                .build();
    }

}
