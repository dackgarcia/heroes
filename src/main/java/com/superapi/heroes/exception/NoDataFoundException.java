package com.superapi.heroes.exception;

/**
 * @author David Garcia 26/9/2021
 */

public class NoDataFoundException extends RuntimeException {
    public NoDataFoundException() {
        super("Data no encontrada");
    }
}
