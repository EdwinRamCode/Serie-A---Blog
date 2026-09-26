package com.edwin.blog.seriea_blog_core;

import java.util.List;

public interface JugadorRepository {

    public void save();
    public Jugador findById(String nombre);
    public List<Jugador> showAll();
}
