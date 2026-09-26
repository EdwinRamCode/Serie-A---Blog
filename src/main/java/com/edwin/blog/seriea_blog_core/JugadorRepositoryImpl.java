package com.edwin.blog.seriea_blog_core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JugadorRepositoryImpl implements JugadorRepository{

    List<Jugador> listJugadores = new ArrayList<>(Arrays.asList(
            new Jugador("Edwin Ariel", "Ramos Alvarez", 22, "Defensa","18"),
            new Jugador("James", "Tavernier", 22, "Defensa","4"),
            new Jugador("James", "Rodriguez", 29, "Medio","10"),
            new Jugador("Radamel", "Falcao", 38, "Delantero","9")
    ));



    @Override
    public void save() {
        listJugadores.add(new Jugador());
    }

    @Override
    public Jugador findById(String nombre) {
        for(Jugador jugador : listJugadores){
            if (jugador.getNombres().equalsIgnoreCase(nombre)) {
                return jugador;
            }
        }
        return null;
        }

    @Override
    public List<Jugador> showAll() {
        return listJugadores;
    }
}

