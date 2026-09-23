package com.edwin.blog.seriea_blog_core;

public class Main {

    public static void main(String[] args) {
        Jugador objJugador = new Jugador("Edwin Ariel","Ramos Alvarez", 22,"Defensa","92");
        Equipo objEquipo = new Equipo("Blackburn Rovers","London","Blackburn Arena",1967);

        System.out.println(objJugador);
        System.out.println(objEquipo);
    }
}
