package com.edwin.blog.seriea_blog_core;

import java.util.List;

public interface JugadorRepository {

    public void save(Jugador jugador);
    public JugadorDTO findById(String nombre);
    public List<JugadorDTO> showAll();
}
