package com.riwi.final_assessment.infrastructure.config;

import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@Configuration
@OpenAPIDefinition(info = @Info(title = "Gestor de tareas", version = "1.0", description = "Documentación api de administración de Tareas"))
public class OpenApi {
}