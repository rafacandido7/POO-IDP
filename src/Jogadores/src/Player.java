package Jogadores.src;
import java.util.UUID;
import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private UUID id;

  private String name;
  private String role;
  private String teamName;
  private String rank;

  public Player(String name, String role, String teamName, String rank) {
    this.id = UUID.randomUUID();
    this.name = name;
    this.role = role;
    this.teamName = teamName;
    this.rank = rank;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public String getRank() {
    return rank;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }

  public void insertPlayer(EntityManager entityManager) {
    entityManager.getTransaction().begin();
    entityManager.persist(this);
    entityManager.getTransaction().commit();
  }
}
