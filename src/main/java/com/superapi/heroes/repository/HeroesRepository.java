package com.superapi.heroes.repository;

import com.superapi.heroes.entity.HeroesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author David Garcia 23/9/2021
 */
@Repository
public interface HeroesRepository extends JpaRepository<HeroesEntity, Integer> {
    @Query("select h from HeroesEntity h where h.nombre like %?1%")
    List<HeroesEntity> findByName(String name);
}
