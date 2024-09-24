package io.github.lisi9988.config;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * OpenAPI 配置
 *
 * @author Tomcat
 */
@Configuration
@SecurityScheme(type = SecuritySchemeType.HTTP)
public class OpenApiConfig {

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Knife4j Parameter Group demo")
                        .description("Knife4j Parameter Group demo Doc")
                        .version("v1.0.0"));
    }

    @Bean
    public GroupedOpenApi saleGroupedOpenApi() {
        return GroupedOpenApi.builder()
                .group("Knife4j Parameter Group demo")
                .displayName("Knife4j Parameter Group demo")
                .pathsToMatch("/**")
                .build();
    }
}
