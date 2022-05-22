package io.fsbano;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public GroupedOpenApi marketplaceApi() {
		return GroupedOpenApi.builder()
				.group("marketplace")
				.pathsToMatch("/api/**")
				.build();
	}

}
