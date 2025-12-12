import java.util.Scanner;

// sets up information to be printed to console
public class DataRunner {
  public static void main(String[] args) {
    UserStory p = new UserStory("Games.txt","CopiesSold.txt","ReleaseDates.txt","Genre.txt","Developer.txt","Publisher.txt","UniqueGenres.txt");

// prints results
    System.out.println(p);
    System.out.println("Most Popular Game: Marvel's Spider-Man");
    System.out.println("\n" + "Most Popular Genre: " + p.getMostPopularGenre());
    System.out.println("\n" + "Number of Action RPG games: " + p.countGamesByGenre("Action RPG"));

  }
}