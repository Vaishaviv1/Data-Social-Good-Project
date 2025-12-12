import java.util.Scanner;

public class UserStory {
// initializes arrays
  private String[] uniqueGenres;
  public String[] games;
  private String[] copies;
  private String[] dev;
  private String[] pub;
  private String[] genre;

  public UserStory(String GamesFile,String CopiesSoldFile, String ReleaseDatesFile, String GenreFile, String DeveloperFile, String PublisherFile, String UniqueGenresFile) {

    /* reads information in txt files, 
    * inputs information as strings in previously made arrays
    */
    this.uniqueGenres = FileReader.toStringArray(UniqueGenresFile);
    this.games = FileReader.toStringArray(GamesFile);
    this.copies = FileReader.toStringArray(CopiesSoldFile);
    this.dev = FileReader.toStringArray(DeveloperFile);
    this.pub = FileReader.toStringArray(PublisherFile);
    this.genre = FileReader.toStringArray(GenreFile);
  }

  // creates variable i to match each file index, prints list to console
  public String toString() {
    String output = "Game Data:\n";
    for (int i = 0; i < games.length; i++) {
      output = output + "Name: " + games[i] + " - Number of copies: " + copies[i] + " - Developer: " + dev[i] + " - Publisher: " + pub[i] + " - Genre: " + genre[i]+ "\n";
    }

    return output;
  }
  
  /*iterates through the genres, 
  * checks if current genre = parameter genre
  * increases count by 1
  */ 
  public int countGamesByGenre(String targetGenre) {
    int count = 0;

    for (int i = 0; i < genre.length; i++) {
      if (genre[i].equals(targetGenre)) {
        count = count + 1;
      }
    }

    return count;
  }

  public String getMostPopularGenre() {

    // starts with the first genre as the most popular
    String maxGenre = uniqueGenres[0];
    int maxCount = countGamesByGenre(uniqueGenres[0]);

    // checks each unique genre to find which appears most and sets it as max
    for (int i = 1; i < uniqueGenres.length; i++) {
      int currentCount = countGamesByGenre(uniqueGenres[i]);

      if (currentCount > maxCount) {
        maxCount = currentCount;
        maxGenre = uniqueGenres[i];
      }
    }

    return maxGenre;
  }
}
