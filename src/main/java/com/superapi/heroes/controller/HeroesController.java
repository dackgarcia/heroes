package com.superapi.heroes.controller;

import com.superapi.heroes.annotation.CustomHeroes;
import com.superapi.heroes.entity.HeroesEntity;
import com.superapi.heroes.service.HeroesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author David Garcia 23/9/2021
 */

@RestController
public class HeroesController {
    private static final Logger logger = LoggerFactory.getLogger(HeroesController.class);
    @Autowired
    HeroesService heroesService;

    /**
     * Metodo para consultar todos los hereoes en bd H2
     *
     * @return
     */
    @GetMapping("/heroes")
    @CustomHeroes
    public List<HeroesEntity> consultarHeroes() {
        logger.info("--HeroesController.consultarHeroes");
        return heroesService.consultarHerores();
    }

    /**
     * Metodo para consultar heroe por ID
     *
     * @param id
     * @return
     */
    @Cacheable("cacheHeroes")
    @GetMapping("/heroes/{id}")
    public HeroesEntity consultarHeroePorId(@PathVariable Integer id) {
        logger.info("--HeroesController.consultarHeroePorId : " + id);
        return heroesService.consultarHeroePorId(id);
    }

    /**
     * Metodo para consultar heroes por Nombre
     *
     * @param nombre
     * @return
     */
    @GetMapping("/heroes/nombre/{nombre}")
    public List<HeroesEntity> consultarHeroePorNombre(@PathVariable String nombre) {
        logger.info("--HeroesController.consultarHeroePorNombre : " + nombre);
        return heroesService.consultarHeroesPorNombre(nombre);
    }

    /**
     * Metodo para eliminar heroe por ID - bd H2
     *
     * @param id
     * @return
     */
    @DeleteMapping("/heroes/{id}")
    public void eliminarHeroePorId(@PathVariable Integer id) {
        logger.info("--HeroesController.eliminarHeroePorId : " + id);
        heroesService.eliminarHeroePorId(id);
    }

    /**
     * Metodo para editar heroe
     *
     * @param model
     * @return
     */
    @PutMapping("/heroes/")
    public HeroesEntity editarHeroe(@RequestBody HeroesEntity model) {
        logger.debug("--HeroesController.editarHeroe : " + model.toString());
        return heroesService.guardarHeroe(model);
    }

    /**
     * Metodo para crear heroe
     *
     * @param model
     * @return
     */
    @PostMapping("/heroes/")
    public HeroesEntity crearHeroe(@RequestBody HeroesEntity model) {
        logger.debug("--HeroesController.crearHeroe : " + model.toString());
        return heroesService.guardarHeroe(model);
    }

}
