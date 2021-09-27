package com.superapi.heroes;

import com.superapi.heroes.entity.HeroesEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.jdbc.Sql;

import static org.junit.Assert.assertTrue;

@SpringBootTest(classes = HeroesApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
class HeroesApplicationTests {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;


    @Sql({"classpath:schema.sql", "classpath:data.sql"})
    @Test
    public void testHeroesById() {

        assertTrue(
                this.restTemplate.getForObject("http://localhost:" + port + "/heroes/1", HeroesEntity.class).getNombre().equals("Batman"));
    }

}
