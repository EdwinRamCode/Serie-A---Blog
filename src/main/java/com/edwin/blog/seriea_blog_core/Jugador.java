package com.edwin.blog.seriea_blog_core;

public class Jugador {

    private String nombres;
    private String apellidos;
    private Integer edad;
    private String posicion;
    private String dorsal;


    public Jugador() {}

    public Jugador(String nombres, String apellidos, Integer edad, String posicion, String dorsal) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.posicion = posicion;
        this.dorsal = dorsal;
    }

    //getters and setters

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    //implement toString

    @Override
    public String toString() {
        return "Jugador{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", posicion='" + posicion + '\'' +
                ", dorsal='" + dorsal + '\'' +
                '}';
    }
}
