package com.edwin.blog.seriea_blog_core;

public record JugadorDTO(String nombre, String posicion, String dorsal) {

    public static JugadorDTO toDTO(Jugador jugador){
        if (jugador == null){
            return null;
        }
        return new JugadorDTO(jugador.getNombres(), jugador.getPosicion(), jugador.getDorsal());
    }
}
