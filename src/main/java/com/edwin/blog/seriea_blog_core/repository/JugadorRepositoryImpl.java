package com.edwin.blog.seriea_blog_core.repository;

import com.edwin.blog.seriea_blog_core.domain.Jugador;
import com.edwin.blog.seriea_blog_core.dto.JugadorDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JugadorRepositoryImpl implements JugadorRepository {

    List<Jugador> listJugadores = new ArrayList<>(Arrays.asList(
            new Jugador("Edwin Ariel", "Ramos Alvarez", "18"),
            new Jugador("James", "Tavernier", "4"),
            new Jugador("James", "Rodriguez", "10"),
            new Jugador("Radamel", "Falcao", "9")
    ));

    @Override
    public void save(Jugador jugador) {
        listJugadores.add(jugador);
    }

    @Override
    public JugadorDTO findById(String nombre) {
        for(Jugador jugador : listJugadores){
            if (jugador.getNombres().equalsIgnoreCase(nombre)) {
                return JugadorDTO.toDTO(jugador);
            }
        }
        return null;
        }

    @Override
    public List<JugadorDTO> showAll() {
        return listJugadores.stream()
                .map(JugadorDTO::toDTO) // Metodo mapper en accion
                .toList();
    }

    @Override
    public void delete(Jugador jugador) {
        listJugadores.remove(jugador);
    }

    @Override
    public void update(Jugador jugadorActualizado) {
        for (Jugador jugador : listJugadores){
            if (jugador.getDorsal().equals(jugadorActualizado.getDorsal())){
                jugador.setNombres(jugadorActualizado.getNombres());
                jugador.setApellidos(jugadorActualizado.getApellidos());
                jugador.setDorsal(jugadorActualizado.getDorsal());
                jugador.setEdad(jugadorActualizado.getEdad());
                jugador.setPosicion(jugadorActualizado.getPosicion());
                break;
            }
        }

    }
}

