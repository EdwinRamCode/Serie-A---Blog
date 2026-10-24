package com.edwin.blog.seriea_blog_core.domain;

public class ArticuloAnalisis extends Articulo {

    public ArticuloAnalisis(String titulo, String contenido, String fecha, String autor) {
        super(titulo, contenido, fecha, autor);
    }

    @Override
    public void resumen() {
        System.out.println(super.getTitulo() + super.getContenido() + super.getFecha() + super.getAutor());
    }
}
