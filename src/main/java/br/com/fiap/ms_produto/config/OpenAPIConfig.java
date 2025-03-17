package br.com.fiap.ms_produto.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition
@Configuration
//quando temos endpoints protegidos
//@SecurityScheme(name = "bearerAuth", type = SceuritySchemeType.HTTP, scheme = "bearer")
public class OpenAPIConfig {

    @Bean
    public OpenAPI apiProdutos(){
        return new OpenAPI().info(new Info().title("Microsserviço Produtos").description("Projeto de Refrência - MS-Produtos").version("v0.0.1").license(new License().name("Apache 2.0").url("https://github.com/kinderenge/produtos-ref")));
    }
}
