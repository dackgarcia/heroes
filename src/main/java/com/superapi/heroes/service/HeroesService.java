package com.superapi.heroes.service;

import com.superapi.heroes.entity.HeroesEntity;

import java.util.List;

/**
 * @author David Garcia 23/9/2021
 */

public interface HeroesService {
    List<HeroesEntity> consultarHerores();

    HeroesEntity consultarHeroePorId(Integer id);

    List<HeroesEntity> consultarHeroesPorNombre(String nombre);

    void eliminarHeroePorId(Integer id);

    HeroesEntity guardarHeroe(HeroesEntity entity);
}
