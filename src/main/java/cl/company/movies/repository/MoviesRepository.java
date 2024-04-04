package cl.company.movies.repository;

import cl.company.movies.models.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<Pelicula,Long> {
}
