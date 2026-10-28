package com.edwin.blog.seriea_blog_core.repository;

import com.edwin.blog.seriea_blog_core.domain.Equipo;

import java.util.HashSet;
import java.util.Set;

public class EquipoRepository {

    private Set<Equipo> equipos = new HashSet<>();

    public boolean agregarEquipos(Equipo equipo){
        return equipos.add(equipo);
    }

    public Set<Equipo> getEquipos() {
        return equipos;
    }
}
