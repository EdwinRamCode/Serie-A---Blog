package com.edwin.blog.seriea_blog_core;

public class CronicaPartido extends Articulo{

    public CronicaPartido(String titulo, String contenido, String fecha, String autor) {
        super(titulo, contenido, fecha, autor);
    }

    @Override
    void resumen() {
        System.out.println(super.getTitulo() + super.getContenido() + super.getFecha() + super.getAutor());
    }
}
