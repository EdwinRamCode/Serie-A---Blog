package com.edwin.blog.seriea_blog_core;

import com.edwin.blog.seriea_blog_core.domain.ArticuloAnalisis;
import com.edwin.blog.seriea_blog_core.domain.CronicaPartido;
import com.edwin.blog.seriea_blog_core.domain.Equipo;
import com.edwin.blog.seriea_blog_core.domain.Jugador;

public class Main {

    public static void main(String[] args) {
        Jugador objJugador = new Jugador("Edwin Ariel","Ramos Alvarez", 22,"Defensa","92");
        Equipo objEquipo = new Equipo("Blackburn Rovers","London","Blackburn Arena",1967);

        System.out.println(objJugador);
        System.out.println(objEquipo);

        //Implementacion de las clases abstractas
        ArticuloAnalisis objArticuloAnalisis = new ArticuloAnalisis("Impactante Juego", "Simula descripcion del juego" , "22-05-2026" , "Edwin Ramos");
        objArticuloAnalisis.resumen();

        CronicaPartido objCronicaPartido = new CronicaPartido("Juego x" , "simula descripcion del juego", "22-05-2026","Edwin Ramos jeje");
        objCronicaPartido.resumen();


    }
}
