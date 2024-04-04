package cl.company.movies.services;

import cl.company.movies.models.Pelicula;

import java.util.List;
import java.util.Optional;

public interface MovieService {

    List<Pelicula> findAll();
    Optional<Pelicula>findById(Long id);

    Pelicula saveMovie(Pelicula movie);

}
