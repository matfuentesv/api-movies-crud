package cl.company.movies.controller;

import cl.company.movies.models.Pelicula;
import cl.company.movies.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/peliculas")
    public ResponseEntity<List<Pelicula>> findAll(){

        return ResponseEntity.ok(movieService.findAll());
    }

    @GetMapping("/pelicula/{id}")
    public ResponseEntity<Pelicula> findById(@PathVariable Long id){

        Optional<Pelicula> optional = movieService.findById(id);
        return optional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/guardar")
    public ResponseEntity<?> save(@RequestBody Pelicula movie){

        return ResponseEntity.ok(movieService.saveMovie(movie));
    }

}
