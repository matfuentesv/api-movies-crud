```yaml
## API de Películas

Esta API proporciona una interfaz para listar películas desde una base de datos, entregando la siguiente información:

- id
- título
- año
- director
- género
- sinopsis

## Uso Básico


GET     /peliculas                       : Lista todas las películas
GET     /peliculas/{id}                  : Busca una película por su id
POST    /guardar                         : Guarda una nueva película en la base de datos
PUT     /actualizar/{id}                 : Actualiza una película por su id
DELETE  /eliminar/{id}                   : Elimina una película por su id


## Consultar todas las películas
   GET /peliculas
   URL: http://localhost:8081/api/peliculas
   Respuesta: [
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
    }
   ]
   
## Consultar película por 'id'
   GET /pelicula/{id}
   URL: http://localhost:8081/api/pelicula/1
   Respuesta: 
   {
        "id": 4,
        "titulo": "The Dark Knight",
        "ano": 2008,
        "director": "Christopher Nolan",
        "genero": "Action",
        "sinopsis": "https://www.imdb.com/title/tt0468569/"
   }

## Guardar nueva película
   POST /pelicula/{id}
   URL: http://localhost:8081/api/guardar
   Entrada:
   {
        "titulo": "The Dark Knight",
        "ano": 2008,
        "director": "Christopher Nolan",
        "genero": "Action",
        "sinopsis": "https://www.imdb.com/title/tt0468569/"
    }
   Respuesta:
   {
        "id": 1,
        "titulo": "The Dark Knight",
        "ano": 2008,
        "director": "Christopher Nolan",
        "genero": "Action",
        "sinopsis": "https://www.imdb.com/title/tt0468569/"
   }

## Actualizar película
   PUT /pelicula/{id}
   URL: http://localhost:8081/api/actualizar/{1}
   Entrada:
   {
        "titulo": "The Dark Knight",
        "ano": 2008,
        "director": "Christopher Nolan",
        "genero": "Action",
        "sinopsis": "https://www.imdb.com/title/tt0468569/"
   }
   Respuesta:
   {
        "id": 1,
        "titulo": "The Dark Knight",
        "ano": 2008,
        "director": "Christopher Nolan",
        "genero": "Action",
        "sinopsis": "https://www.imdb.com/title/tt0468569/"
   }

## Eliminar película
   DELETE /pelicula/{id}
   URL: http://localhost:8081/api/eliminar/{1}
   Entrada:
   No se requiere entrada.
  
   Respuesta:
     'Pelicula eliminada correctamente'