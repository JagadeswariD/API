MiniHackathon3_REST_API


1. breakout to 4 Teams

REQUIREMENTS:

2. Each team will get a API KEY From http://www.omdbapi.com/Links to an external site.  (or just use my apikey=b79fdda2)

3. Please Create a form that will accept the following input:

    Title    ( that is the Movie title )

4. Figure out how to parse the JSON formated data returned into a pojo and display these fields on a Nicely formatted result page:

Note: Poster image should be displayed

 "Title": "Trading Places",
  "Year": "1983",
  "Rated": "R",
  "Released": "08 Jun 1983",
  "Runtime": "116 min",
  "Genre": "Comedy",
  "Director": "John Landis",
  "Writer": "Timothy Harris, Herschel Weingrod",
  "Actors": "Eddie Murphy, Dan Aykroyd, Ralph Bellamy",
  "Plot": "A snobbish investor and a wily street con artist find their positions reversed as part of a bet by two callous millionaires.",
  "Language": "English",
  "Country": "United States",
  "Awards": "Nominated for 1 Oscar. 3 wins & 5 nominations total",
  "Poster": "https://m.media-amazon.com/images/M/MV5BYTEzMjBiMzktMjQyMS00YzBhLTgzNWQtNzA0NmEwMTNmMDQ2XkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_SX300.jpg",
  "Ratings":  ( JUST the Rotten Tomatoes Rating )
      "Source": "Rotten Tomatoes",
      "Value": "88%"
====================================

Extra Bragging  Rights  Bonus,  Save This data to db->table-row

Extra Extra Bragging Rights  save the image as a blob
