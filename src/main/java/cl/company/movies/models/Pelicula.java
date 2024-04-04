package cl.company.movies.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Pelicula")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "ano")
    private int ano;
    @Column(name = "director")
    private String director;
    @Column(name = "genero")
    private String genero;
    @Column(name = "sinopsis")
    private String sinopsis;


    public int getId() {
        return id;
    }

    public Pelicula setId(int id) {
        this.id = id;
        return this;
    }

    public String getTitulo() {
        return titulo;
    }

    public Pelicula setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public int getAno() {
        return ano;
    }

    public Pelicula setAno(int ano) {
        this.ano = ano;
        return this;
    }

    public String getDirector() {
        return director;
    }

    public Pelicula setDirector(String director) {
        this.director = director;
        return this;
    }

    public String getGenero() {
        return genero;
    }

    public Pelicula setGenero(String genero) {
        this.genero = genero;
        return this;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public Pelicula setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
        return this;
    }
}
