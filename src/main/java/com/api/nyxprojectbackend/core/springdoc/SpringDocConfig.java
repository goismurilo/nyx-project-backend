package com.api.nyxprojectbackend.core.springdoc;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Despesas de Recife API")
                        .version("v1")
                        .description("Projeto de uma API que apresenta dados sobre os gastos do Recife no ano de 2017.")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0")
                        )
                )
                .externalDocs(new ExternalDocumentation()
                        .description("Link para o GitHub do Projeto")
                        .url("https://github.com/goismurilo/nyx-project-backend")
                )
                .tags(
                        Arrays.asList(
                                new Tag().name("Expenses").description("Despesas de Reife"),
                                new Tag().name("Month").description("Despesas de Recife")
                        )
                );
    }
}
