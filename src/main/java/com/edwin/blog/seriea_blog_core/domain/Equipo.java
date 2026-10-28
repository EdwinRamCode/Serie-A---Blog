package com.edwin.blog.seriea_blog_core.domain;

import java.util.Objects;

/**
 * Representa un equipo participante en la Serie A.
 *
 * Contiene la información básica de un club, como su nombre,
 * ciudad, estadio y la colección de jugadores asociados.
 * Esta entidad permite modelar la relación entre equipos
 * y jugadores dentro del dominio de la aplicación.
 *
 * @author Edwin
 */
public class Equipo {

    private String nombre;
    private String ciudad;
    private String nombreEstadio;
    private Integer anioFundacion;

    public Equipo(){}

    public Equipo(String nombre, String ciudad, String nombreEstadio, Integer anioFundacion) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.nombreEstadio = nombreEstadio;
        this.anioFundacion = anioFundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombreEstadio() {
        return nombreEstadio;
    }

    public void setNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
    }

    public Integer getAnioFundacion() {
        return anioFundacion;
    }

    public void setAnioFundacion(Integer anioFundacion) {
        this.anioFundacion = anioFundacion;
    }


    //implement toString

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", nombreEstadio='" + nombreEstadio + '\'' +
                ", anioFundacion='" + anioFundacion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return Objects.equals(nombre, equipo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }
}
