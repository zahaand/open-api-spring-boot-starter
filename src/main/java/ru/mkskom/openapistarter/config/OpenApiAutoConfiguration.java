package ru.mkskom.openapistarter.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.mkskom.openapistarter.properties.OpenApiProperties;

@Configuration
@EnableConfigurationProperties(OpenApiProperties.class)
public class OpenApiAutoConfiguration {

    @Autowired
    private OpenApiProperties properties;

    @Bean
    @ConditionalOnMissingBean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                .title(properties.getTitle())
                .description(properties.getDescription())
                .version(properties.getVersion()));
    }
}
