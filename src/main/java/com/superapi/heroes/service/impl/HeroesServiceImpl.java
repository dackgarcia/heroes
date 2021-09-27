package com.superapi.heroes.service.impl;

import com.superapi.heroes.entity.HeroesEntity;
import com.superapi.heroes.exception.HeroesNotFoundException;
import com.superapi.heroes.exception.NoDataFoundException;
import com.superapi.heroes.repository.HeroesRepository;
import com.superapi.heroes.service.HeroesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author David Garcia 23/9/2021
 */
@Service
public class HeroesServiceImpl implements HeroesService {
    @Autowired
    HeroesRepository heroesRepository;

    @Override
    public List<HeroesEntity> consultarHerores() {
        return  heroesRepository.findAll();
    }

    @Override
    public HeroesEntity consultarHeroePorId(Integer id) {
        return heroesRepository.findById(id).orElseThrow(()-> new HeroesNotFoundException(id));
    }

    @Override
    public List<HeroesEntity> consultarHeroesPorNombre(String nombre) {
        List<HeroesEntity> lista = heroesRepository.findByName(nombre);
        if(lista.size()==0){
            throw new NoDataFoundException();
        }
        return lista;
    }

    @Override
    public void eliminarHeroePorId(Integer id) {
        try {
            heroesRepository.deleteById(id);
        } catch (Exception e) {
           throw new NoDataFoundException();
        }
    }

    @Override
    public HeroesEntity guardarHeroe(HeroesEntity entity) {
        return heroesRepository.save(entity);
    }
}
