@Test
public void validateUserProfile() {
    given()
            .header("Authorization", getToken())
            .when()
            .get(SpotifyEndpoints.GET_ME)
            .then()
            .statusCode(200)
            .body("display_name", notNullValue())
            .body("id", notNullValue());
}
