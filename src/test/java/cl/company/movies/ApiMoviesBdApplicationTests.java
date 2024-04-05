package cl.company.movies;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiMoviesBdApplicationTests {

	@BeforeClass
	public static void init() {
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8082;
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

}
