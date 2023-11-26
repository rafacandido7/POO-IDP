package Jogadores.src;

import java.util.List;
import javax.persistence.*;

public class Main {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory =
      Persistence.createEntityManagerFactory("bd_jpa_player_h2");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    Player johnDoe = new Player("John Doe", "Sniper", "Navy SEALs", "Sergeant");
    Player janeSmith = new Player("Jane Smith", "Assault Rifle", "Delta Force", "Master Sergeant");
    Player alexJohnson = new Player("Alex Johnson", "Demolitions", "Spetsnaz", "Captain");

    johnDoe.insertPlayer(entityManager);
    janeSmith.insertPlayer(entityManager);
    alexJohnson.insertPlayer(entityManager);

    entityManager.close();
  }

  private static List<Player> listPlayers(EntityManager entityManager) {
    List<Player> players = entityManager.createQuery("select p from Player p", Player.class)
      .getResultList();

    for (Player p : players) {
      System.out.println("ID: " + p.getId().toString());
      System.out.println("Name: " + p.getName());
      System.out.println("Role: " + p.getRole());
      System.out.println("Team Name: " + p.getTeamName());
      System.out.println("Rank: " + p.getRank());
      System.out.println("--------------");
    }

    return players;
  }

}
