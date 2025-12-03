@Test
public void searchTrack() {
    given()
            .header("Authorization", getToken())
            .queryParam("q", "Eminem")
            .queryParam("type", "track")
            .when()
            .get(SpotifyEndpoints.SEARCH)
            .then()
            .statusCode(200)
            .body("tracks.items", notNullValue());
}
