package com.edwin.blog.seriea_blog_core.repository;

import com.edwin.blog.seriea_blog_core.domain.Jugador;
import com.edwin.blog.seriea_blog_core.dto.JugadorDTO;

import java.util.List;

/**
 * Define las operaciones de acceso a datos relacionadas
 * con la gestión de jugadores.
 *
 * Esta interfaz abstrae las operaciones de consulta,
 * almacenamiento, actualización y eliminación de jugadores,
 * siguiendo el patrón Repository para desacoplar la lógica
 * de negocio de la capa de persistencia.
 *
 * @author Edwin
 */
public interface JugadorRepository {

    public void save(Jugador jugador);
    public JugadorDTO findById(String nombre);
    public List<JugadorDTO> showAll();
}
