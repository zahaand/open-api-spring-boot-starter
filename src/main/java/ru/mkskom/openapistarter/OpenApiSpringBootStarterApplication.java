package ru.mkskom.openapistarter;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpenApiSpringBootStarterApplication {
    private final OpenAPI openAPI;

    public OpenApiSpringBootStarterApplication(OpenAPI openApi) {
        openAPI = openApi;
        System.out.println(openApi.getInfo().getTitle());
        System.out.println(openApi.getInfo().getVersion());
        System.out.println(openApi.getInfo().getDescription());
    }

    public static void main(String[] args) {
        SpringApplication.run(OpenApiSpringBootStarterApplication.class, args);
    }

}
