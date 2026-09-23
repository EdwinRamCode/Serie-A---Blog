package com.edwin.blog.seriea_blog_core;

public class Equipo {
    //nombre, ciudad, estadio, fundacion

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

    //getters and setters

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
}
