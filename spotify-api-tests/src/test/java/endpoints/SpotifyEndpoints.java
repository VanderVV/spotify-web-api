package endpoints;

public class SpotifyEndpoints {

    public static final String GET_ME = "/me";
    public static final String GET_USER_PLAYLISTS = "/me/playlists";
    public static final String CREATE_PLAYLIST = "/users/{user_id}/playlists";
    public static final String ADD_TRACK_TO_PLAYLIST = "/playlists/{playlist_id}/tracks";
    public static final String SEARCH = "/search";
    public static final String GET_TRACK = "/tracks/{track_id}";
    public static final String GET_AUDIO_FEATURES = "/audio-features/{track_id}";
}
