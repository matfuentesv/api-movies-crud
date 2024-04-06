package cl.company.movies;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMovie {

    @BeforeClass
    public static void init() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8081;
    }

    @org.junit.Test
    public void testFindAll() {
        given()
                .get("api/peliculas").then().assertThat()
                .statusCode(200);
    }

    @org.junit.Test
    public void testFindMovieById() {
        given()
                .pathParams("id", "1")
                .get("api/pelicula/{id}").then().assertThat()
                .statusCode(200);
    }

    @org.junit.Test
    public void testCreateMovie() {
        ObjectNode objectIn = JsonNodeFactory.instance.objectNode();
        objectIn.put("titulo", "Gladiador");
        objectIn.put("ano", 2000);
        objectIn.put("director", "Ridley Scott");
        objectIn.put("genero", "Accion");
        objectIn.put("sinopsis", "");
        given().body(objectIn).contentType(ContentType.JSON).when().post("api/guardar")
                .then().assertThat().statusCode(200);
    }

    @org.junit.Test
    public void testUpdateMovie() {
        ObjectNode objectIn = JsonNodeFactory.instance.objectNode();
        objectIn.put("titulo", "Gladiador");
        objectIn.put("ano", 2000);
        objectIn.put("director", "Ridley Scott");
        objectIn.put("genero", "Accion");
        objectIn.put("sinopsis", "xxxx");

        given()
                .pathParams("id",82)
                .body(objectIn).contentType(ContentType.JSON).when().put("api/actualizar/{id}")
                .then().assertThat().statusCode(200);
    }
    @org.junit.Test
    public void testDeleteMovie() {
        given()
                .pathParams("id", 81)
                .delete("api/eliminar/{id}")
                .then()
                .assertThat()
                .statusCode(200);
    }

}
