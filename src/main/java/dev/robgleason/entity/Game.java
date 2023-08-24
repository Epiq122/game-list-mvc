package dev.robgleason.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "game")
public class Game {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "game_title")
    private String gameTitle;

    @Column(name = "game_developer")
    private String gameDeveloper;

    @Column(name = "email")
    private String email;


    //define constructors
    public Game() {
    }

    public Game(String gameTitle, String gameDeveloper, String email) {
        this.gameTitle = gameTitle;
        this.gameDeveloper = gameDeveloper;
        this.email = email;
    }
    // getters/setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public String getGameDeveloper() {
        return gameDeveloper;
    }

    public void setGameDeveloper(String gameDeveloper) {
        this.gameDeveloper = gameDeveloper;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //tostring
    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", gameTitle='" + gameTitle + '\'' +
                ", gameDeveloper='" + gameDeveloper + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
