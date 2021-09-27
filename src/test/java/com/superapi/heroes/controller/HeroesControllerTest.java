package com.superapi.heroes.controller;

import com.superapi.heroes.entity.HeroesEntity;
import com.superapi.heroes.service.HeroesService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

/**
 * @author David Garcia 26/9/2021
 */
@ExtendWith(MockitoExtension.class)
class HeroesControllerTest {
    @InjectMocks
    HeroesController controller;

    @Mock
    HeroesService heroesService;

    @Test
    void consultarHeroes() {
        // given
        HeroesEntity heroe1 = new HeroesEntity("Loki", "Loki es un dios en la mitología Nórdica", "griego", "sabe leer", "rey del hielo");
        HeroesEntity heroe2 = new HeroesEntity("Thor", "Thor es un dios en la mitología Nórdica", "griego", "super fuerza", "Thor");

        List<HeroesEntity> list = new ArrayList<HeroesEntity>();
        list.addAll(Arrays.asList(heroe1, heroe2));

        when(heroesService.consultarHerores()).thenReturn(list);

        // when
        List<HeroesEntity> result = controller.consultarHeroes();

        // then
        assertThat(result.size()).isEqualTo(2);

        assertThat(result.get(0).getNombre())
                .isEqualTo(heroe1.getNombre());

        assertThat(result.get(1).getNombre())
                .isEqualTo(heroe2.getNombre());
    }
}