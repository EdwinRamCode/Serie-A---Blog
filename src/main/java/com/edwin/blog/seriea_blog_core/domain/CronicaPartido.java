package com.edwin.blog.seriea_blog_core.domain;

/**
 * Representa una crónica deportiva de un partido.
 *
 * Una crónica describe los acontecimientos más importantes
 * ocurridos durante un encuentro, incluyendo resultados,
 * jugadas destacadas y análisis general del desarrollo del juego.
 *
 * Esta clase extiende o complementa la funcionalidad de un
 * artículo tradicional dentro del blog.
 *
 * @author Edwin
 */

public class CronicaPartido extends Articulo {

    public CronicaPartido(String titulo, String contenido, String fecha, String autor) {
        super(titulo, contenido, fecha, autor);
    }

    @Override
    public void resumen() {
        System.out.println(super.getTitulo() + super.getContenido() + super.getFecha() + super.getAutor());
    }
}
