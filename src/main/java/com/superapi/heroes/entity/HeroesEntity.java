package com.superapi.heroes.entity;

import javax.persistence.*;

/**
 * @author David Garcia 23/9/2021
 */
@Entity
@Table(name = "HEROES")
public class HeroesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ORIGEN")
    private String origen;
    @Column(name = "PODERES")
    private String poderes;
    @Column(name = "OCUPACION")
    private String ocupacion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getPoderes() {
        return poderes;
    }

    public void setPoderes(String poderes) {
        this.poderes = poderes;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public String toString() {
        return "HeroesEntity{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", origen='" + origen + '\'' +
                ", poderes='" + poderes + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                '}';
    }

    public HeroesEntity() {
    }

    public HeroesEntity(String nombre, String descripcion, String origen, String poderes, String ocupacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.origen = origen;
        this.poderes = poderes;
        this.ocupacion = ocupacion;
    }
}
