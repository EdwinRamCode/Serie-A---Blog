package com.edwin.blog.seriea_blog_core;

abstract class Articulo {

    //por ahora se define fecha como string
    private String titulo;
    private String contenido;
    private String fecha;
    private String autor;

    public Articulo(String titulo, String contenido, String fecha, String autor) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.fecha = fecha;
        this.autor = autor;
    }

    //getters and setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //Metodo abstracto que deben de implementar las clases hijas
    abstract void resumen();
}
