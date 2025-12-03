@Test
public void createPlaylist() {
    String userId =
            given().header("Authorization", getToken())
                    .when().get(SpotifyEndpoints.GET_ME)
                    .then().extract().path("id");

    String payload = "{ \"name\": \"Automation Playlist\", \"public\": false }";

    String playlistId =
            given()
                    .header("Authorization", getToken())
                    .contentType("application/json")
                    .body(payload)
                    .when()
                    .post(SpotifyEndpoints.CREATE_PLAYLIST.replace("{user_id}", userId))
                    .then()
                    .statusCode(201)
                    .extract().path("id");

    System.out.println("Created Playlist: " + playlistId);
}
