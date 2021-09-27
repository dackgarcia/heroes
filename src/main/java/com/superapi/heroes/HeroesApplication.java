package com.superapi.heroes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

/**
 * @author David Garcia 23/9/2021
 */
@SpringBootApplication
@EnableCaching
public class HeroesApplication {
    private static final Logger logger = LoggerFactory.getLogger(HeroesApplication.class);

    public static void main(String[] args) {
        try {
            logger.info("--HeroesApplication - Inicio");
            SpringApplication.run(HeroesApplication.class, args);
        } catch (Exception e) {
            logger.error("--HeroesApplication - ERROR Iniciando... : ", e);
        }
    }
    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager("cacheHeroes");
    }
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "SUPER API - HEROES",
                "Proyecto API-REST  crud de heroes - BD H2",
                "1.0",
                "Terminos del servicio",
                new Contact("David Garcia", "dackgarcia.blogspot.com", "dackgarcia@gmail.com"),
                "Licencia",
                "https://dackgarcia.blogspot.com",
                Collections.emptyList());
    }
}