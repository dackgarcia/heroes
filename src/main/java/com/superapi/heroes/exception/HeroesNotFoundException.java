package com.superapi.heroes.exception;

/**
 * @author David Garcia 26/9/2021
 */

public class HeroesNotFoundException extends RuntimeException{
    public HeroesNotFoundException(Integer id) {
        super(String.format("Heroe con Id %d no encontrado", id));
    }
}
