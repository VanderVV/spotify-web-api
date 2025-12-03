1. API Test Strategy (High-level)
Objective

Validate core Spotify API endpoints using automated tests that cover:

Authentication (OAuth 2.0)

Users API

Playlists

Tracks

Search

Scope
Category	Endpoints
Authentication	Token generation
User	/me, get user profile
Playlist	create playlist, get playlist, add items
Tracks	get track, get audio features
Search	search for artist, tracks
Tech Stack
Tool	Purpose
Postman	Manual API exploration + Collection export
REST-Assured	Automated execution in Java
Maven	Build management
TestNG	Test execution
2. POSTMAN COLLECTION DESIGN

Your Postman collection should include:

Folder 1: Authentication

✔ Get Access Token (Authorization Code Flow or Client Credentials)
✔ Refresh Token

Folder 2: User API

✔ Get Current User Profile
✔ Get User’s Playlists

Folder 3: Playlist API

✔ Create Playlist
✔ Add Track to Playlist
✔ Get Playlist Details
✔ Search Track then add to Playlist

Folder 4: Tracks API

✔ Get Track
✔ Get Track Audio Features

Folder 5: Search

✔ Search Artist
✔ Search Track
