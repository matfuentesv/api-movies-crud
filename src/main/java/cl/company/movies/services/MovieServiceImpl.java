package cl.company.movies.services;

import cl.company.movies.models.Pelicula;
import cl.company.movies.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MoviesRepository moviesRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Pelicula> findAll() {
        return moviesRepository.findAll()
                               .stream().sorted(Comparator.comparingInt(Pelicula::getId))
                               .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Pelicula> findById(Long id) {
        return moviesRepository.findById(id);
    }

    @Override
    public Pelicula saveMovie(Pelicula movie) {
        return moviesRepository.save(movie);
    }
}
