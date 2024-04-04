# api-movies

Api encargada de listar peliculas desde base de datos,entregando la siguiente información:

● id
● titulo
● ano
● director
● genero
● sinopsis

## Uso básico
```http
GET  /peliculas                       : Lista el total de peliculas
GET  /peliculas/{id}                  : Busca una pelicula por id
POST /guardar                         : Guardar en Base de datos una nueva pelicula
```


### Consultar todas las películas

GET /peliculas
URL: http://localhost:8081/api/peliculas
Respuesta:
```json
[
    {
        "id": 1,
        "titulo": "Inception",
        "ano": 2010,
        "director": "Christopher Nolan",
        "genero": "Sci-Fi",
        "sinopsis": "https://www.imdb.com/title/tt1375666/"
    },
    {
        "id": 2,
        "titulo": "The Shawshank Redemption",
        "ano": 1994,
        "director": "Frank Darabont",
        "genero": "Drama",
        "sinopsis": "https://www.imdb.com/title/tt0111161/"
    },
    {
        "id": 3,
        "titulo": "The Godfather",
        "ano": 1972,
        "director": "Francis Ford Coppola",
        "genero": "Crime",
        "sinopsis": "https://www.imdb.com/title/tt0068646/"
    },
    {
        "id": 4,
        "titulo": "The Dark Knight",
        "ano": 2008,
        "director": "Christopher Nolan",
        "genero": "Action",
        "sinopsis": "https://www.imdb.com/title/tt0468569/"
    },
  
]
```

### Consultar peliculas por 'id'
GET /pelicula/{id}
URL: http://localhost:8081/api/pelicula/1
Respuesta:
```json
[
    {
        "id": 1,
        "titulo": "Inception",
        "ano": 2010,
        "director": "Christopher Nolan",
        "genero": "Sci-Fi",
        "sinopsis": "https://www.imdb.com/title/tt1375666/"
    },
    {
        "id": 2,
        "titulo": "The Shawshank Redemption",
        "ano": 1994,
        "director": "Frank Darabont",
        "genero": "Drama",
        "sinopsis": "https://www.imdb.com/title/tt0111161/"
    },
    {
        "id": 3,
        "titulo": "The Godfather",
        "ano": 1972,
        "director": "Francis Ford Coppola",
        "genero": "Crime",
        "sinopsis": "https://www.imdb.com/title/tt0068646/"
    },
    {
        "id": 4,
        "titulo": "The Dark Knight",
        "ano": 2008,
        "director": "Christopher Nolan",
        "genero": "Action",
        "sinopsis": "https://www.imdb.com/title/tt0468569/"
    },
  
]```



### Guardar nueva pelicula
POST /pelicula/{id}
URL: http://localhost:8081/api/guardar
Entrada:
    {
        "titulo": "xxxx",
        "ano": 2024,
        "director": "xxxx",
        "genero": "xxx",
        "sinopsis": "xxxxx"
    }
Respuesta:
  JSON ENTRADA:
    {
        "id": 41,
        "titulo": "xxxx",
        "ano": 2024,
        "director": "xxxx",
        "genero": "xxx",
        "sinopsis": "xxxxx"
    }

### Guarda una nueva pelicula

POST /guardar
```

 Respuesta:

    {
    "id": 9,
    "titulo": "Fight Club",
    "ano": 1999,
    "director": "David Fincher",
    "genero": "Drama",
    "sinopsis": "https://www.imdb.com/title/tt0137523/"
    }